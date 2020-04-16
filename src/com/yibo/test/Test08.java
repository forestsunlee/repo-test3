package com.yibo.test;

/**
 * @Description 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 两个指针p1,p2，开始都指向头结点
 *  * 先让p2走k步
 *  * 然后p1,p2同时向下走
 *  * 当p2指向null的时候，p1就是倒数第k个节点
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/7
 */
public class Test08 {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
     ListNode p1 = head,p2 = head;
     while (k>0 && p2!= null) {
         p2 = p2.next;
         k -- ;
     }
        if(p2 == head || (p2 == null && k>0)) return  null;
     while (p2!= null) {
         p1 = p1.next;
         p2 = p2.next;
     }

     return p1;
    }


    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
