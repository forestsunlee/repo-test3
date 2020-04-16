package com.yibo.test;

import java.util.Stack;

/**
 * @Description 用2个栈实现一个队列
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/3
 */
public class Test02 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        Integer result = null;
        //如果stack2不是空，就把栈顶的元素取出来
        if (!stack2.empty()){
            result = stack2.pop();
        }else {
            //如果stack2是空，就把stack1的元素都弹出来，放到stack2
            while (!stack1.empty()) {
                Integer pop = stack1.pop();
                stack2.push(pop);
            }
            if (!stack2.empty()) {
                result = stack2.pop();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.push(1);
        test02.push(2);
        test02.push(3);
        test02.push(4);
        System.out.println(test02.pop());
        System.out.println(test02.pop());
        System.out.println(test02.pop());
        System.out.println(test02.pop());


    }
}
