package com.yibo.test;

import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/9
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length-1; i >=0 ; i--) {
            builder.append(chars[i]);
        }
        System.out.println(builder.toString());
    }
}
