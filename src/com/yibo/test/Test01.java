package com.yibo.test;

import java.util.*;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/2
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一行字符串");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = data.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if('A'<=chars[i] && chars[i]<='Z') {
                if (map.size()==0){
                    map.put(chars[i],1);
                }else if (map.containsKey(chars[i])){
                    map.put(chars[i],map.get(chars[i])+1);
                }else {
                    map.put(chars[i],1);
                }
            }
        }

        Set<Character> characters = map.keySet();
        for (Character key : characters) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
