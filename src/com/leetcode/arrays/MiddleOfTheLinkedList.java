package com.leetcode.arrays;

import java.util.*;

public class MiddleOfTheLinkedList {
//
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
//
//    public static ListNode middleNode(ListNode head) {
////        ListNode cur = head;
////        ListNode result = head;
////        int counter = 0;
////        while (cur.next != null) {
////            counter++;
////            cur = cur.next;
////        }
////        int count = counter;
////        while (counter != count /2) {
////            counter--;
////            result = result.next;
////        }
////        System.out.println(counter);
////        System.out.println(result.val);
////        return result;
////        ListNode[] A = new ListNode[100];
////        int t = 0;
////        while (head.next != null) {
////            A[t++] = head;
////            head = head.next;
////        }
////        return A[t / 2];
////        if (head == null) return null;
//        Stack<Integer> temp = new Stack<>();
//        ListNode current = head;
//        int size = 0;
//        int i = 0;
//        while (current != null) {
//            size++;
//            current = current.next;
//        }
//        int[] result = new int[size];
//        while (head != null) {
//            temp.push(head.val);
//            ListNode max = head;
//            while (max != null) {
//                if (temp.peek() < max.val) {
//                    temp.pop();
//                    temp.push(max.val);
//                }
//                max = max.next;
//                result[i] = temp.peek();
//            }
//            head = head.next;
//            i++;
//        }
//        return result;
//    }
//
//public int numComponents(ListNode head, int[] G) {
//    ListNode current = head;
//    int result = 0;
//    List<Integer> nums = new ArrayList<>();
//    for (int el : G) {
//        nums.add(el);
//    }
//    Collections.sort(nums);
//    while(current != null) {
//
//    }
//    return result''
//}

    public static void main(String[] args) {
        ListNode next3 = new ListNode(7);
        ListNode next4 = new ListNode(4);
        ListNode next5 = new ListNode(3);
        ListNode next6 = new ListNode(5);
        next3.next = next4;
        next4.next = next5;
        next5.next = next6;
        next6.next = null;
        ListNode lst = new ListNode(2,next3);
//        middleNode(lst);
    }
}
