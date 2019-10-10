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

import com.qiyuesuo.pdf.text.E;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-10 11:13
 * @Description: jsoup方式 获取虎扑新闻列表页
 **/

public class jsoup {

    public static void main(String[] args) {
        String url = "https://voice.hupu.com/nba";
        jsoupList(url);
    }



    public static void jsoupList(String url){

        System.out.println("====爬取开始====");
        try {
            Document document = Jsoup.connect(url).get();
            //使用css选择器 提取列表新闻a表签
            Elements elements = document.select("div.news-list > ul > li > div.list-hd > h4 > a");

            for (Element element:elements){
                //获取详情页链接
                String d_url=element.attr("href");
                //获取标题
                String title = element.ownText();
                System.out.println("详情页链接："+d_url+",详情页标题:"+title);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("====爬取结束====");
        }
    }





}
