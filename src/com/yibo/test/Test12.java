package com.yibo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Description 给定n个字符串，请对n个字符串按照字典序排列。
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/8
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            List<String > list = new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(scanner.next());
            }
            Collections.sort(list);
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}
