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

import java.util.*;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-08 15:44
 * @Description: 随机获取100以内的10个数且不重复并排序
 **/

public class NoRepeatRandom {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            int num = random.nextInt(100);//获取随机数
            set.add(num);
        }

    }
}
