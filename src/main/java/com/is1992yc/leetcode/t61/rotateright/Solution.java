package com.is1992yc.leetcode.t61.rotateright;

import java.util.List;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 *
 * @author yican
 */
public class Solution {

    /**
     * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :39 MB, 在所有 Java 提交中击败了5.41%的用户
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode oldEnd= head;
        //统计有多少个元素
        int n = 1;
        while (oldEnd.next != null){
            oldEnd = oldEnd.next;
            n++;
        }
        //将链表闭环
        oldEnd.next = head;
        //n-k%n为新头, n-k%n-1为新尾
        ListNode newEnd = head;
        for (int i = 0; i < n - k%n -1; i++) {
            newEnd = newEnd.next;
        }
        //指定新的头
        head = newEnd.next;
        //将闭环断开
        newEnd.next = null;
        return head;

    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


}
