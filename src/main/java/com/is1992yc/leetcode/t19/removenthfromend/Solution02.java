package com.is1992yc.leetcode.t19.removenthfromend;

/**
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * @author yican
 */
public class Solution02 {

    /**
     * 递归
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return doWork(head,n) == n ? head.next : head;
    }

    private int doWork(ListNode node,int n){
        if (node.next == null){
            return 1;
        }
        int current = doWork(node.next,n);
        if (n == current){
            if (n == 1){
                node.next = null;
            }else {
                node.next = node.next.next;
            }
        }
        current++;
        return current;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


}
