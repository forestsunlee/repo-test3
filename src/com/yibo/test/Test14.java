package com.yibo.test;

import java.util.*;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/8
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int big=0,small=0,number=0,other=0;
            String str = scanner.next();
            if (str.length()<=8) {
                System.out.println("NG");
                return;
            }

            char[] chars = str.toCharArray();
            for (char aChar : chars) {
                if (aChar >= 'A' && aChar <= 'Z') {
                    big =1;
                }else if (aChar >= 'a' && aChar <= 'z') {
                    small =1;
                }else if (aChar >='0' && aChar <= '9') {
                    number = 1;
                }else {
                    other = 1;
                }
            }
            if (big + small + number + other < 3) {
                System.out.println("NG");
                return;
            }

            //求字符串超过3的子集
            List<String> list = new ArrayList<>();
            for (int i = 0; i <chars.length-2 ; i++) {
                StringBuilder builder = new StringBuilder();
                String string = builder.append(chars[i]).append(chars[i + 1]).append(chars[i + 2]).toString();
                list.add(string);
            }
            Map<String, Integer> map = new HashMap<>();
            for (String item : list) {
                if (str.contains(item)) {
                }
            }


            System.out.println("OK");

        }
    }
}
