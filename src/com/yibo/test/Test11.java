package com.yibo.test;

import java.util.Scanner;

/**
 * @Description 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/8
 */
public class Test11 {
    public static String reverseStr(String data){
        String[] datas = data.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = datas.length-1; i >=0 ; i--) {
            builder.append(datas[i]).append(" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(Test11.reverseStr(line));
    }
}
