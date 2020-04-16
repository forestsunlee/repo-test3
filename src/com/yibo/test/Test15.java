package com.yibo.test;

import java.util.Scanner;

/**
 * @Description  1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/9
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            char tagert = aChar;
            if (Character.isUpperCase(aChar)) {
                if (aChar == 'Z') {
                    tagert = 'a';
                }else {
                char c = Character.toLowerCase(aChar);
                tagert = Character.toChars(c+1)[0];
                }

            }else {
                if ("abc".contains(tagert+"")) {
                    tagert = '2';
                }
                if ("def".contains(tagert+"")) {
                    tagert = '3';
                }
                if ("ghi".contains(tagert+"")) {
                    tagert = '4';
                }
                if ("jkl".contains(tagert+"")) {
                    tagert = '5';
                }
                if ("mno".contains(tagert+"")) {
                    tagert = '6';
                }
                if ("pqrs".contains(tagert+"")) {
                    tagert = '7';
                }
                if ("tuv".contains(tagert+"")) {
                    tagert = '8';
                }
                if ("wxyz".contains(tagert+"")) {
                    tagert = '9';
                }
            }

                builder.append(tagert);
        }
                System.out.println(builder.toString());
    }
}
