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
 * @CreationTime: 2019-09-24 10:51
 * @Description: While循环
 **/

public class MainWhile {
    public static void main(String[] args) {
        /*
        * 循环语句就是让计算机根据条件做循环计算，在条件满足时继续循环，条件不满足时退出循环。
        * 例如，计算从1到100的和：
        * 1 + 2 + 3 + 4 + … + 100 = ?
        * 除了用数列公式外，完全可以让计算机做100次循环累加。因为计算机的特点是计算速度非常快，我们让计算机循环一亿次也用不到1秒，所以很多计算的任务，人去算是算不了的，但是计算机算，使用循环这种简单粗暴的方法就可以快速得到结果。
        * 我们先看Java提供的while条件循环。它的基本用法是：
        *
        * while循环在每次循环开始前，首先判断条件是否成立。如果计算结果为true， 那个循环体能的内容执行一遍，如果计算结果为false，那就直接跳到while循环的末尾，继续往下执行
        * 我们来使用1到100
        * */

        int sum = 0; // 累加的和，初始化为0
        int n=1;
        while(n<=100){
            System.out.println(sum+":"+n);
            sum=sum+n;
            n++;
        }
        System.out.println(sum);
        /*
        * 注意到while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
        * */
        System.out.println("=================================");
        int su = 0;
        int c = 0;
        while(c<=100){
            c++;
            su = su+c;
        }
        System.out.println(su);
        /*
        * 小总结
        * white 循环先判断循环条件是否满足，在执行循环语句；
        * white循环可能一次都不执行
        * 编写循环时 要注意循环条件，并避免死循环
        * */


    }
}
