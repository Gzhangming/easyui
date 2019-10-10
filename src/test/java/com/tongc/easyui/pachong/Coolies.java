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

import org.apache.catalina.valves.CrawlerSessionManagerValve;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-10 15:19
 * @Description: 先从网站上登录，然后查看 request headers 里面的 cookies
 * 手动设置 cookies
 **/

public class Coolies {

    public static void main(String[] args)  throws Exception  {
        String user_info_url="https://www.douban.com/people/177613934/";
        setCoolies(user_info_url);
    }


    public static void setCoolies(String url) throws IOException {
        Document cookie = Jsoup.connect(url)
                .header("Cookie", "bid=js520losR0M; douban-fav-remind=1; __yadk_uid=rHIIQ5HX3xb5VjaYGOF0Wp0qA9Is49a7; trc_cookie_storage=taboola%2520global%253Auser-id%3Dddc95c4d-e74e-4af2-8abe-c54eb19f6d5d-tuct48621a1; ll=\"108296\"; _pk_ref.100001.8cb4=%5B%22%22%2C%22%22%2C1570689625%2C%22https%3A%2F%2Fwww.baidu.com%2Flink%3Furl%3DbFOxIoXmCO472HE4ZB8MtBKWcnsgsluq4m03510o1R7GOBn-fQYNSbA5gHjigoyO%26wd%3D%26eqid%3Dd7cb0ec800041ddc000000055d9ed256%22%5D; __utma=30149280.1887497590.1569496098.1569496098.1570689626.2; __utmc=30149280; __utmz=30149280.1570689626.2.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; ap_v=0,6.0; regpop=1; dbcl2=\"177613934:3ZAQYoavVzM\"; ck=EIKo; push_noty_num=0; push_doumail_num=0; __utmv=30149280.17761; douban-profile-remind=1; _pk_id.100001.8cb4=0012ed2a103054d9.1569496095.2.1570690562.1569496095.")
                .get();
        if (cookie!=null){
            //获取豆瓣名称节点
            Element first = cookie.select(".info h1").first();
            if (first==null){
                System.out.println("没有找到 .info h1 标签");
                return;
            }
            //取出豆瓣节点昵称
            String s = first.ownText();
            System.out.println("豆瓣我的网名为："+s);
        }else {
            System.out.println("异常！！！！！");
        }
    }


}
