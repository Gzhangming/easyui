package com.tongc.easyui.switchingDate;//
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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-31 16:15
 * @Description: 时间类型转换学习
 **/

public class SwitchingDate {
    public static void main(String[] args) {
        Date currentTime = new Date();
        SimpleDateFormat formatter  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println(dateString);


        String dateStrings="2019-10-11 10:10:10";
        SimpleDateFormat format  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = format.parse(dateStrings);
            System.out.println(parse);
        }catch (Exception e){
            e.printStackTrace();
        }

        //获取时间戳
        SimpleDateFormat formats =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long dateTime = System.currentTimeMillis();
        String c =formats.format(dateTime);
        try {
            System.out.println(formats.parse(c));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
