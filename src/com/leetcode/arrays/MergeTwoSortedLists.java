package com.leetcode.arrays;

public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null)
            cur.next = l1;
        if (l2 != null)
            cur.next = l2;
        return head.next;
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
        ListNode lst = new ListNode(0, next);
        ListNode next11 = new ListNode(2);
        ListNode next22 = new ListNode(5);
        ListNode next33 = new ListNode(6);
        ListNode next44 = new ListNode(6);
        ListNode next55 = new ListNode(8);
        next11.next = next22;
        next22.next = next33;
        next33.next = next44;
        next44.next = next55;
        next55.next = null;
        ListNode lst1 = new ListNode(0, next11);
        mergeTwoLists(lst, lst1);

    }

}
