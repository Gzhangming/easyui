package com.tongc.easyui.pachong;//
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


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-10 13:40
 * @Description: httpclient + 正则表达式 获取虎扑新闻列表页
 **/

public class httpClient {

    public static void main(String[] args) {
        String url = "https://voice.hupu.com/nba";
        httpClientList(url);
    }

    public static void httpClientList(String url){

        try {
            CloseableHttpClient aDefault = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse execute = aDefault.execute(httpGet);
            if (execute.getStatusLine().getStatusCode()==200){
                HttpEntity entity = execute.getEntity();
                String s = EntityUtils.toString(entity, "utf-8");
                if (s!=null){
                    /*
                     * 替换掉换行符、制表符、回车符，去掉这些符号，正则表示写起来更简单一些
                     * 只有空格符号和其他正常字体
                     */
                    Pattern p = Pattern.compile("\t|\r|\n");
                    Matcher m = p.matcher(s);
                    s = m.replaceAll("");
                    /*
                     * 提取列表页的正则表达式
                     * 去除换行符之后的 li
                     * <div class="list-hd">                                    <h4>                                        <a href="https://voice.hupu.com/nba/2485167.html"  target="_blank">与球迷亲切互动！凯尔特人官方晒球队开放训练日照片</a>                                    </h4>                                </div>
                     */
                    Pattern pattern = Pattern
                            .compile("<div class=\"list-hd\">\\s* <h4>\\s* <a href=\"(.*?)\"\\s* target=\"_blank\">(.*?)</a>\\s* </h4>\\s* </div>" );
                    Matcher matcher = pattern.matcher(s);
                    //匹配出所有符合正則表达式的数据
                    while (matcher.find()){
                        //提取出链接和标题
                        System.out.println("详情页链接:"+matcher.group(1)+",详情页标题："+matcher.group(2));
                    }
                }else {
                    System.out.println("处理失败！！！获取正文内容为空");
                }
            }else {
                System.out.println("处理失败！！！返回状态码：" + execute.getStatusLine().getStatusCode());
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
