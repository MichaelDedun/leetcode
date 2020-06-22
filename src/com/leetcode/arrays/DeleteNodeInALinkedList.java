package com.leetcode.arrays;

public class DeleteNodeInALinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode next = new ListNode(1);
        ListNode next2 = new ListNode(2);
        ListNode next3 = new ListNode(3);
        ListNode next4 = new ListNode(4);
        ListNode next5 = new ListNode(5);
        next.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = next5;
        next5.next = null;
        deleteNode(next3);
    }
}
