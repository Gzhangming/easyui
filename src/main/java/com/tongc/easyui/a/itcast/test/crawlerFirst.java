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

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-11 14:27
 * @Description: httpClient请求小练习
 **/

public class crawlerFirst {
    public static void main(String[] args) throws IOException {
        //httpClient和浏览器访问的区别
        //浏览器访问 1. 打开浏览器 2. 输入网址 3. 回车发起请求返回响应 4. 解析响应，获取数据
        //httpClient
        //1.创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.get请求 输入网址
        HttpGet httpGet = new HttpGet("http://www.itcast.cn");
        //3.HTTPClient对象发起请求返回响应
        CloseableHttpResponse execute = httpClient.execute(httpGet);
        //4.解析响应 获取数据
        //在获取数据的时候查看是否状态码 查看是否响应成功  200 表示成功
        if (execute.getStatusLine().getStatusCode()==200){
            //拿到响应体
            HttpEntity httpEntity = execute.getEntity();
            //解析响应体
            String  content= EntityUtils.toString(httpEntity, "UTF-8");
            System.out.println(content);
        }
    }
}
