package com.yibo.test;

import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/11
 */
public class Test19 {
    public static void Encrypt (char aucPassword[], char aucResult[]){
            int i = 0 ;
        for (char c : aucPassword) {
            if (c >= 'a' && c <= 'z') {
                c = c == 'z' ? 'A' : Character.toUpperCase(Character.toChars(c + 1)[0]);
            }else if (c >= 'A' && c <= 'Z') {
                c = c == 'Z' ? 'a' : Character.toLowerCase(Character.toChars(c+1)[0]);
            }else {
                c = c == '9' ? '0' : Character.toChars(c + 1)[0];
            }
            aucResult[i] = c ;
            i++;
        }
        System.out.println(aucResult);
    }

    public static int unEncrypt (char result[], char password[]) {
            int i = 0 ;
        for (char c : result) {
            if (c >= 'a' && c <= 'z') {
                c = c == 'a' ? 'Z' : Character.toUpperCase(Character.toChars(c -1)[0]);
            }else if (c >= 'A' && c <= 'Z') {
                c = c == 'A' ? 'z' : Character.toLowerCase(Character.toChars(c-1)[0]);
            }else {
                c = c == '0' ? '9' : Character.toChars(c - 1)[0];
            }
            password[i] = c ;
            i++;
        }
        System.out.println(password);
        return  1 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] list = line.split(" ");
        if (list.length >= 2) {
        Test19.Encrypt(list[0].toCharArray(),new char[list[0].length()]);
        Test19.unEncrypt(list[1].toCharArray(),new char[list[1].length()]);
        }
    }
}
