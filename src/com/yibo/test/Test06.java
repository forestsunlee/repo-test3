package com.yibo.test;

/**
 * @Description 计算一个整数的二进制数中1的个数
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/7
 */
public class Test06 {
    public int NumberOf1(int n) {
     int num = 0;
        String string = Integer.toBinaryString(n);
        char[] chars = string.toCharArray();
        for (Character ch : chars) {
            if (ch =='1') {
                num ++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Test06().NumberOf1(11));
    }
}
