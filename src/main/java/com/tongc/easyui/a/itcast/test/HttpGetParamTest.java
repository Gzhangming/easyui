package com.tongc.easyui.a.itcast.test;//
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

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-12 16:33
 * @Description: get请求获取数据
 **/

public class HttpGetParamTest {
    public static void main(String[] args) throws Exception  {
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //设置请求地址：https://so.csdn.net/so/search/s.do?q=java
        //创建URIBuilder
        URIBuilder uriBuilder = new URIBuilder("https://so.csdn.net/so/search/s.do");
        //设置参数
        uriBuilder.setParameter("q","java");
        //创建HttpGet对象，设置url访问地址
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        System.out.println("发起请求信息："+httpGet);
        CloseableHttpResponse  response=null;
        try {
            //使用HttpClient发起请求，获取response
            response= httpClient.execute(httpGet);
            //解析
            if (response.getStatusLine().getStatusCode()==200){
                String s = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(s.length());
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                response.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
