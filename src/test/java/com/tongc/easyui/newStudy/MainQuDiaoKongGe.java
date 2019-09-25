package com.tongc.easyui.newStudy;//
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

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-09-25 16:54
 * @Description: java 去除字符串的空格的方法
 **/

public class MainQuDiaoKongGe {
    public static void main(String[] args) {
        String str = "  hi            world  ~  ";
        System.out.println(":"+str+":");
        //使用String 的 trim()方法 去掉首尾空格
        System.out.println(":"+str.trim()+":");
        //使用replace(" ","")替换掉所有空格
        System.out.println(":"+str.replace(" ","")+":");
        //使用replaceAll(" ","")替换掉所有空格
        System.out.println(":"+str.replaceAll(" ","")+":");
//      str.replaceAll(" +","");  //去掉所有空格，包括首尾、中间
//      str.replaceAll("\\s*", ""); //可以替换大部分空白字符， 不限于空格
    }
}
