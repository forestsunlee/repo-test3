package com.yibo.test;

import java.util.Scanner;

/**
 * @Description 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/8
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binaryString = Integer.toBinaryString(n);
        char[] chars = binaryString.toCharArray();
        int cuntor = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                cuntor ++;
            }
        }
        System.out.println(cuntor);
    }
}
