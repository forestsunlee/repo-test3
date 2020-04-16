package com.yibo.test;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/3
 */
public class Test04 {
    public static double Power(double base, int exponent) {
        double res = 1;

        if (exponent ==0) {
            return 1;
        }

        if (exponent>0) {

        for (int i = 0; i <exponent ; i++) {
            res = res * base;
        }
        }

        if (exponent<0) {
            exponent = exponent * -1;
            for (int i = 0; i <exponent ; i++) {
                res = res * base;
            }
            res = 1/res;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(Test04.Power(2,-3));
    }
}
