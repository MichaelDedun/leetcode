package com.leetcode.arrays;

import java.util.*;

public class IntersectionOfTwoLinkedLists {

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        List<ListNode> nodes = new ArrayList<>();
//        ListNode currentA = headA;
//        ListNode currentB = headB;
//        while(currentA != null) {
//            nodes.add(currentA);
//            currentA = currentA.next;
//        }
//        if (nodes.size() == 0) {
//            return null;
//        }
//        while(currentB != null) {
//            if (nodes.contains(currentB)) {
//                return currentB;
//            }
//            currentB = currentB.next;
//        }
//        return null;
//    }
//
    public static boolean  pali(ListNode head) {
        StringBuilder temp = new StringBuilder();
        ListNode cur = head.next;
        while (cur != null) {
            temp.append(cur);
            cur = cur.next;
        }
        String pali = temp.toString();
        int left = 0;
        int right = pali.length() - 1;
        char[] reversePali = pali.toCharArray();
        while (left != right) {
            char tmp = reversePali[right];
            reversePali[right--] = reversePali[left];
            reversePali[left++] = tmp;
        }
        return pali.equals(String.valueOf(reversePali));
    }

    public static void main(String[] args) {
        ListNode next = new ListNode(1);
        ListNode next2 = new ListNode(2);
        ListNode next3 = new ListNode(2);
        ListNode next4 = new ListNode(1);
        next.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = null;
        ListNode lstA = new ListNode(0, next);
        pali(lstA);
    }
}
