package com.yibo.test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/9
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");

        int countor = 0 ;
        Double sum = new Double(0) ;
        DecimalFormat format = new DecimalFormat("#######0.0");
        for (String str : list) {
            if (Integer.parseInt(str) < 0 ) {
                countor ++;
            }else {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(countor);
        int otherCou = list.length - countor;
        if (otherCou > 0) {
            sum = sum / otherCou;
        }
        System.out.println(format.format(sum));
    }
}
