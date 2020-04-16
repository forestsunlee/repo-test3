package com.yibo.test;

import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/13
 */
public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] list = line.split(" ");
            for (String item : list) {
                int i = Integer.parseInt(item.substring(2).toUpperCase(), 16);
                System.out.println(i);
            }
        }
    }
}
