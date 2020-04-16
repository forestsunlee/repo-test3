package com.yibo.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/9
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if(!((aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'Z') || (aChar >= '0' && aChar <='9') || aChar == ' ')){
             continue;
            }
            if (map.size()==0) {
                map.put(aChar,1);
            }else {
                if (map.containsKey(aChar)) {
                    map.put(aChar,map.get(aChar)+1);
                }else {
                    map.put(aChar,1);
                }
            }
        }
        for (Character character : map.keySet()) {
            Integer value = map.get(character);

        }
        System.out.println(map);
    }
}
