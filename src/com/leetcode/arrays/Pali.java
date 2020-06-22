package com.leetcode.arrays;

import java.util.Arrays;
import java.util.Objects;

public class Pali {

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

    public static boolean pali(ListNode head) {
        ListNode cur = head.next;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        int i = 0;
        int[] temp = new int[length];
        cur = head.next;
        while (cur != null) {
            temp[i] = cur.val;
            cur = cur.next;
            i++;
        }
        int[] palindrom = new int[temp.length];
        System.arraycopy(temp, 0, palindrom, 0, temp.length);
        int left = 0, right = palindrom.length - 1;
        while (left < right) {
            int tmp = palindrom[left];
            palindrom[left++] = palindrom[right];
            palindrom[right--] = tmp;
        }
        for (int j = 0; j < temp.length; j++)
            if (temp[j] != palindrom[j])
                return false;
        return true;
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
        System.out.println(pali(lstA));
    }


}
