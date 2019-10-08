package com.tongc.easyui.interview;//
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
 * @CreationTime: 2019-10-08 14:29
 * @Description: 统计某段字符串中的某个字符串的个数
 **/

public class FindKeyWords {
    public static void main(String[] args) {
   String text = "An array is a data struct. Trying to find array which is the keyword";
        int arrayCount=0;
        int index=-1;
        String arrayStr = "array";
        index=text.indexOf("array");//查找指定字符或字符串在字符串中第一次出现地方的索引，未找到的情况返回 -1.
        while (index>=0){
            ++arrayCount;
            index+=arrayStr.length();
            index=text.indexOf(arrayStr,index);
        }
        System.out.println("array数量为"+arrayCount);
    }
}
