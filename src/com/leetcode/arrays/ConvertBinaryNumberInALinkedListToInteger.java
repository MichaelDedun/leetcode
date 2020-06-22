package com.leetcode.arrays;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }



    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null) {
            num = num*2 + head.val;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
        ListNode next = new ListNode(0);
        ListNode next2 = new ListNode(1);
        next.next = next2;
        ListNode lst = new ListNode(1, next);
        getDecimalValue(lst);
    }


}
