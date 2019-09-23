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
 * @CreationTime: 2019-09-23 11:20
 * @Description: 输入和输出
 **/

public class Main {
    public static void main(String[] args) {
//      输出
        /*
        * 在前面的一些代码中 我们总是用到 System.out.print();  来向屏幕输入一点内容
        * println 是print line 的缩写  表示输出并换行。 因此，如果输出后不想换行可以使用print()
        * */
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");

//      格式化输出
        /*
        * Java还提供了格式化输出的功能。为什么要格式化输出？因为计算机表示的数据不一定适合人来阅读
        * */
        double b = 12900000;
        System.out.println(b);
        /*
        * 如果想把数据显示成我们期望的格式，就需要使用格式化输出的功能，格式化输出使用System.out.printf(),通过使用占位符、%？，printf()可以把后面的参数格式化成指定格式；
        * */
        double e = 3.1415926;
        System.out.printf("%.2f\n",e);
        System.out.printf("%.4f\n",e);
        /*
        * java 的格式化功能提供了多种占位符，可把各种数据类型“格式化”成指定的字符串
        * */
        /*占位符               说明
        %d	            格式化输出整数
        %x	            格式化输出十六进制整数
        %f	            格式化输出浮点数
        %e	            格式化输出科学计数法表示的浮点数
        %s	            格式化字符串
        注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身*/
        /*
        *占位符本身还可以有更详细的格式化参数，下面的列子把一个整数格式化成十六进制，并用0补足8位。
        * */
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
        System.out.println();

//      输入
        /*
        * 和输出相比，Java的输入就要复杂得多。
        * 我们先看一个从控制台读取一个字符串和一个整数的例子：
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name:");
        String name = scanner.nextLine();
        System.out.print("Input your age:");
        int age = scanner.nextInt();
        System.out.println(name+":"+age);
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        /*
 练习
请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
        * */
        Scanner s = new Scanner(System.in);
        System.out.print("上次考试成绩:");
        int shangci = s.nextInt();
        System.out.print("本次考试成绩:");
        int peici = s.nextInt();
        System.out.println(shangci+":"+peici);


    }
}
