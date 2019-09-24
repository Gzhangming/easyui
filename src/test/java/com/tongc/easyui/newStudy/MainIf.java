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
 * @CreationTime: 2019-09-23 15:19
 * @Description: if判断
 **/

public class MainIf {
    public static void main(String[] args) {
//        条件判断
        int n = 70;
        if (n >= 60){
            System.out.println("及格了！！！！！");
        }
        System.out.println("END");
//        条件判断
        if (n>=60){
            System.out.println("及格了");
            System.out.println("恭喜你");
        }
        System.out.println("END");
//        else
        /*
        * if语句还可以编写一个else{........},当条件判断为false时,将执行else的语句块。
        * */
        if (n>=80){
            System.out.println("这次考试的太棒了");
        }else{
            System.out.println("这次考试不是太理想");
        }
        System.out.println("END");
        /*
        *注意,else不是必须的
        * 还可以用多个if ... else if ... 串联。 例如:
        * */
        if (n>=90){
            System.out.println("优秀");
        } else if (n>=60){
            System.out.println("及格了");
        }else{
            System.out.println("挂科了");
        }
        System.out.println("END");
        /*
        * 串联效果相当于：
        * */
        if (n>=90){
            //n>=90 为true
            System.out.println("优秀");
        }else {
            //n>=90 为false
            if (n>=60){
                //n>=60 为true
                System.out.println("及格了");
            }else{
                //n>=60 为false
                System.out.println("挂科了");
            }
        }
        System.out.println("END");
        /*
        * 在串联使用多个if时,要特别注意判断顺序
        * */
        int c = 100;
        if (c >= 60) {
            System.out.println("及格了");
        } else if (c >= 90) {
            System.out.println("优秀");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
        /*
        * 执行发现,c=100时,满足条件c>=90 ,但输出的不是"优秀"，而是"及格了",原因是if语句是从上到下执行时,现判断n>=60成功后，后续else不在执行，因此,if(n>=90)没有机会执行了
        * 正确的方式是按照判断范围从小到大此次判断:
        * */
        // 从大到小依次判断：
        if (c >= 90) {
            // ...
        } else if (c >= 60) {
            // ...
        } else {
            // ...
        }
        // 从小到大依次判断：
        if (c < 60) {
            // ...
        } else if (c < 90) {
            // ...
        } else {
            // ...
        }
        /*
        * 使用if时,还要特别注意边界条件。例如：
        * */
        int f = 90;
        if (f > 90) {
            System.out.println("优秀");
        } else if (f >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
        /*
        * 假设我们期望90分或更高为“优秀”，上述代码输出的却是“及格”，原因是>和>=效果是不同的。
        * 前面讲过了浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此判断浮点数相等用 == 判断不靠谱
        * */
        double x = 1 - 9.0/10;
        if (x==0.1){
            System.out.println("x is 0.1");
        }else {
            System.out.println("x is NOT 0.1");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
//      判断引用类型相等
        /*
        *在java中,判断值类型的变量是否相等,可以使用 == 运算符。但是,判断引用类型的变量是否相等，== 表示"引用是否相等"，或者说，是否指向用一个对象。例如,
        * 下面的两个String类型,它们的内容是相同的,但是,分别指向不同的对象，用==判断,结果为false
        * */
        String s1= "hello";
        String s2= "HELLO".toLowerCase();
        System.out.println(s1+":"+s2);
        System.out.println(s1==s2);
        /*
        * 要判断引用类型的变量内容是否相等，必须使用equals()方法
        * */
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        /*
        * 注意： 执行语句s11.equals(s2)时,如果变量s11为null,会报NUllPointerException;
        * */
        String s11=null;
        /*if (s11.equals("hello")){
            System.out.println("hello");
        }*/
        /*
        * 要避免报错，可以运用短路运算符
        * */
        if(s11!=null&&s11.equals("hello")){
            System.out.println("hello");
        }
        /*
        * 还可以把不是null的对象放在前面
        * */
        System.out.println("hello".equals(s11));

        /*
     小结
    if ... else可以做条件判断，else是可选的；

    不推荐省略花括号{}；

    多个if ... else串联要特别注意判断顺序；

    要注意if的边界条件；

    要注意浮点数判断相等不能直接用==运算符；

    引用类型判断内容相等要使用equals()，注意避免NullPointerException。
        * */




    }
}
