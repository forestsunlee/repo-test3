package com.yibo.test;

/**
 * @Description  斐波那契黄金队列
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/3
 */
public class Test03 {

    public  static int fibonacci(int n){
        int res = 0;
        //0 1 1 2 3 5 8 13
        int a = 0;
        int b = 1;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <=n ; i++) {
          res = a + b;
          a = b;
          b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Test03.fibonacci(7));
    }
}
