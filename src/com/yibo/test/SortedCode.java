package com.yibo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/7
 */
public class SortedCode {
       public static void resoverCode(String string){
           List<Character> list = new ArrayList<>();
           for (int i = string.length()-1; i >=0 ; i--) {
               list.add(string.charAt(i));
           }
           String res = "";
           for (char item : list) {
               res+=item;
           }
           System.out.println(res);
       }

    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        resoverCode(line);
    }
}
