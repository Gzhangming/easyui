package com.tongc.easyui.study;//
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
 * @CreationTime: 2019-09-21 16:10
 * @Description: 学习数据类型
 **/

public class DataTypeDemo {
    /*
    * 数据类型
    *     java是一种强类型的语言
    *          强类型表示，变量在定义的时候必须显示的声明类型是什么     java
    *          弱类型表示，变量会根据值自己去推断，不需要指定类型是什么  js  python
    *     java 数据类型
    *          基本数据类型（四类八种）
    *             整数类型:  byte  short  int  long (不同类型表示的是不同的长度)
    *             byte: 使用一个字节存储，因此范围是 负128 - 正127
    *             short: 使用两个字节存储，因此范围是 负32768 - 正32767
    *             int: 使用四个字节存储，因此范围是 正负21亿
    *             long: 使用八个字节存储，因此范围是  ...........
    *             浮点类型:  float  double
    *             float: 单精度
    *             double: 双精度
    *             字符类型:  char
    *             布尔类型:  boolean
    *                只有true false   占一位
    *          引用数据类型
    * */
    public static void main(String[] args) {
        //byte b = 129;
        //short b=44444;
        //int b=11111111111;
        long b= 111111111111111L;
        int c = 127;
        System.out.println(b==c);

    }
}
