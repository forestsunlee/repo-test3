package com.yibo.test;

import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/7
 */

public class Test10 {

    public static String reverseNumber(int number){
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        StringBuilder strb = new StringBuilder();
        for (int i = chars.length-1; i >=0; i--) {
            strb.append(chars[i]);
        }
        return strb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        String reverseNumber = Test10.reverseNumber(line);
        System.out.println(reverseNumber);
    }
}
