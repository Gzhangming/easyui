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

import com.qiyuesuo.pdf.text.H;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-11 11:00
 * @Description: 采集开源中国项目信息
 **/

public class mezis {
    public static void main(String[] args) throws IOException {

        //使用集合来传多个地址
        Set<String> setUrls = new HashSet<>();
        for (int i=1;i<=5;i++){
            String strUrl="https://www.oschina.net/project/list?company=0&sort=score&lang=0&recommend=false&p="+i;
            System.out.println(strUrl);
            setUrls.add(strUrl);
        }
        System.out.println("=====================================================================================================");
        Set<String> setProjUrls = new HashSet<>();
        for (String stringUrl: setUrls){
            Document document = Jsoup.connect(stringUrl)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:30.0) Gecko/20100101 Firefox/30.0")
                    .get();
            Elements select = document.select("div.box.item");
            for (Element element:select){
                Elements eleUrl  = element.select("div.box-aw a");
                String strPrjUrl = eleUrl.attr("href");
                setProjUrls.add(strPrjUrl);
                Elements eleTitle = eleUrl.select(".title");
                String strTitle = eleTitle.text();
                Elements eleSummary = eleUrl.select(".summary");
                String strSummary  = eleSummary.text();
            }

            for (String stringUrl1:setProjUrls){
                Document document1 = Jsoup.connect(stringUrl1)
                        .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:30.0) Gecko/20100101 Firefox/30.0")
                        .get();
                Elements  elements1= document1.select("div.box-aw a h1");
                
            }



        }

    }
}
