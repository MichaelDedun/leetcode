package com.leetcode.arrays;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode next = new ListNode(1);
        ListNode next2 = new ListNode(1);
        ListNode next3 = new ListNode(2);
        ListNode next4 = new ListNode(3);
        ListNode next5 = new ListNode(3);
        next.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = next5;
        next5.next = null;
        ListNode lst = new ListNode(0, next);
        deleteDuplicates(lst);
    }
}
