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
 * @CreationTime: 2019-09-24 14:09
 * @Description: for循环
 **/

public class MainFor {
    /*
    * 除了while和do...while 循环。java使用最广泛的是 for 循环
    * for循环的功能非常强大，它使用计算机实现循环,然后,在每次循环前检测循环条件，在每次循环后更新计算器。计算器变量名通常命名为i。
    * 我们来吧1到100 求和用for循环改写
    * */
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=100;i++){
            sum = sum+i;
        }
        System.out.println(sum);
        /*
        * 在for 循环执行前 会先执行初始化语句int i = 1, 它定义了计算器变量i 并付初始值为1,然后,循环前先检查循环条件i<=100,循环后自动执行i++,因为,和while循环相比
        * for循环把跟新计算机的代码统一放在一起。在for循环体内部,不需要去跟新变量i.
        * 因此for的用法是：
        * for（初始条件；循环检测条件; 循环后跟新计算器）
        * {//执行语句}
        * */

        /*
        * 如果我们要对一个整数数组的所有元素求和，可以用for循环实现
        * */
        int[] ns = {1, 4, 9, 16, 25 };
        int su = 0 ;
        for (int i=0;ns.length>i;i++){
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            su = su+ns[i];
        }
        System.out.println(su);
        /*
        * 上面代码的循环条件是i<ns.length。因为ns数组的长度是5，因此，当循环5次后，i的值被更新为5，就不满足循环条件，因此for循环结束
        注意for循环的初始化计数器总是会被执行，并且for循环也可能循环0次。
        使用for循环时，千万不要在循环体内修改计数器！在循环体中修改计数器常常导致莫名其妙的逻辑错误。对于下面的代码：
        * */
        int[] na = {1,42,5,77,55};
        int sa = 0;
        for (int i=0;i<=na.length;i++){
            System.out.println(na[i]);
            i= i+1;
        }
        /*
        虽然不会报错，但是，数组元素只打印了一半，原因是循环内部的i = i + 1导致了计数器变量每次循环实际上加了2（因为for循环还会自动执行i++）。
        因此，在for循环中，不要修改计数器的值。计数器的初始化、判断条件、每次循环后的更新条件统一放到for()语句中可以一目了然。
        */
        /*
        * 希望只访问索引为奇数的数组元素，应该把for循环改写为：
        * */
        int[] nb = { 1, 4, 9, 16, 25 };
        for(int i=0;i<=nb.length;i=i+2){
            System.out.println(nb[i]);
        }






    }

}
