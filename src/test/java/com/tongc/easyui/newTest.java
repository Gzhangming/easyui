package com.tongc.easyui;//
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

import java.util.Objects;

/**
 * @Creator: zhang.jiaming
 * @CreationTime: 2019-10-08 13:14
 * @Description: 如何防止数据==或equals时，空指针的出现
 **/

public class newTest {

    private static void equals1(String i,String j){
        try {
            if (i.equals(j)){
                System.out.println("equal1相等");
            }
        }catch (Exception ex){
            System.out.println("equal1 异常：");
            ex.printStackTrace();
        }finally {
            System.out.println("equal1结束");
        }
    }

    private static void equals2(String i,String j){
        try {
            if (j.equals(i)){
                System.out.println("equal2相等");
            }
        }catch (Exception ex){
            System.out.println("equal2异常：");
            ex.printStackTrace();
        }finally {
            System.out.println("equal2结束");
        }
    }

    private static void equals3(String i,String j){
        try {
            if (Objects.equals(i,j)){
                System.out.println("equal3相等");
            }
        }catch (Exception ex){
            System.out.println("equal3异常：");
            ex.printStackTrace();
        }finally {
            System.out.println("equal3结束");
        }
    }


    public static void main(String[] args) {

        //equals1(null,"abc");
        //equals2(null,"abc");
        equals3(null,"abc");

    }
}
