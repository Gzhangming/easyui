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

import java.util.Scanner;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-09-23 18:48
 * @Description: switch多重选择
 **/

public class MainSwitch {
    /*
    * 除了i语句以外,还有一种条件判断,根据莫个表达式的结果，分别去执行不同的分支
    *switch语句根据switch(表达式)计算的结果,跳转到匹配的case结果,然后继续执行后续语句,直到遇见break结束执行
    * 如果没匹配到任何case 这时switch不会执行任何语句。这时可以给 switch语句加上一个default,当没有匹配到任何case时，执行default
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1...5的数字选择关卡:");
        int a = scanner.nextInt();
        switch(a){
            case 1:
                System.out.println("关卡1");
                break;
            case 2:
                System.out.println("关卡2");
                break;
            case 3:
                System.out.println("关卡3");
                break;
            case 4:
                System.out.println("关卡4");
                break;
            case 5:
                System.out.println("关卡5");
                break;
            default:
                System.out.println("请按照提示输入！！！");
        }
        /*
        *
        * */

    }

}
