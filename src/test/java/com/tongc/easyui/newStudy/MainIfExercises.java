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
 * @CreationTime: 2019-09-23 18:00
 * @Description: 练习题
 **/

public class MainIfExercises {
    /*
    请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。

    BMI = 体重(kg)除以身高(m)的平方

    BMI结果：

    过轻：低于18.5
    正常：18.5-25
    过重：25-28
    肥胖：28-32
    非常肥胖：高于32
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入体重(KG):");
        double wt = scanner.nextDouble();
        System.out.println("输入身高(m):");
        double ht = scanner.nextDouble();
        scanner.close();
        double bmi = wt / (ht * ht);
        System.out.printf("BMI指数 %.1f\n", bmi); // 格式化输出
    }
}
