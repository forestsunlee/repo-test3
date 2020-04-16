package com.yibo.test;

import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/13
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float aFloat = scanner.nextFloat();
        float a = aFloat * 10;
        if (a%10 >=5){
            System.out.println((int)aFloat +1);
        }else {
            System.out.println((int)aFloat);
        }
    }
}
