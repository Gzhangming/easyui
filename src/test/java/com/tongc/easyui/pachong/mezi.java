package com.tongc.easyui.pachong;
//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                           O\  =  /O
//                        ____/`---'\____
//                      .'  \\|     |//  `.
//                     /  \\|||  :  |||//  \
//                    /  _||||| -:- |||||-  \
//                    |   | \\\  -  /// |   |
//                    | \_|  ''\---/''  |   |
//                    \  .-\__  `-`  ___/-. /
//                  ___`. .'  /--.--\  `. . __
//               ."" '<  `.___\_<|>_/___.'  >'"".
//              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//              \  \ `-.   \_ __\ /__ _/   .-` /  /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//                      佛祖保佑       永无BUG

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-10 16:07
 * @Description: 获取网页上的所有图片
 **/

public class mezi {

    public static void main(String[] args) {
        Connection connect = Jsoup.connect("http://pic.netbian.com/tupian/20694.html");
        try {
            Document document = connect.get();
            Elements img = document.getElementsByTag("img");
            System.out.println("共检测到下列图片URL：");
            System.out.println("开始下载");
            //遍历img标签并获src的属性
            for (Element element:img){
                //获取每个img标签URL "abs:"表示绝对路径
                String attr = element.attr("abs:src");
                //打印URL
                System.out.println("URL地址:"+attr);
                //下载图片到本地
                downImages("c:/img/dw",attr);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
     * 下载图片到指定目录
     *
     * @param filePath 文件路径
     * @param imgUrl   图片URL
     */
    public static void downImages(String filePath,String imgUrl){
        //若指定文件夹没有，则先创建
        File file = new File(filePath);
        //判断是否存在这个文件夹
        if (!file.exists()){
            boolean mkdirs = file.mkdirs();//创建文件夹
            if (mkdirs){
                System.out.println("创建成功！！！");
            }
        }

        //截取图片文件名
        String fileName  = imgUrl.substring(imgUrl.lastIndexOf('/') + 1,imgUrl.length());
        System.out.println("图片文件名："+fileName);


        try {
            //文件名里面可能有中文或者空格，所以这里要进行处理。但空格又会被URLEncoder转义为加号
            String encode = URLEncoder.encode(fileName , "UTF-8");
            //因此要把加号转化为UTF-8格式的%20
            imgUrl=imgUrl.substring(0,imgUrl.lastIndexOf("/")+1) + encode.replaceAll("\\+", "\\%20");
            System.out.println("处理过后的URL地址："+imgUrl);
        }catch (Exception e){
            e.printStackTrace();
        }


        //写出的路径
        File files =new File(filePath+File.separator+fileName);
        System.out.println("写出的路径："+files);

        try{
            //获取图片URL
            URL url = new URL(imgUrl);
            //获得链接
            URLConnection urlConnection = url.openConnection();
            //设置10秒的相应时间
            urlConnection.setConnectTimeout(10*1000);
            //获得输入流
            InputStream inputStream = urlConnection.getInputStream();
            //获得输出流
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(files));
            //构建缓冲区
            byte[] bytes = new byte[1024];
            int size;
            //写入文件
            while (-1 != (size = inputStream.read(bytes))){
                bufferedOutputStream.write(bytes,0,size);
            }
            bufferedOutputStream.close();
            inputStream.close();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
