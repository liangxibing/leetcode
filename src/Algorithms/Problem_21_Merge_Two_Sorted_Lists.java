package Algorithms;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Problem_21_Merge_Two_Sorted_Lists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1)
            return l2;
        if (null == l2)
            return l1;
        ListNode result = null;
        ListNode cur = null;
        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                if (null == result) {
                    result = new ListNode(l1.val);
                    cur = result;
                } else {
                    cur.next = new ListNode(l1.val);
                    cur = cur.next;
                }
                l1 = l1.next;
            } else {
                if (null == result) {
                    result = new ListNode(l2.val);
                    cur = result;
                } else {
                    cur.next = new ListNode(l2.val);
                    cur = cur.next;
                }
                l2 = l2.next;
            }

        }
        while (null != l1) {
            cur.next = new ListNode(l1.val);
            cur = cur.next;
            l1 = l1.next;
        }
        while (null != l2) {
            cur.next = new ListNode(l2.val);
            cur = cur.next;
            l2 = l2.next;
        }
        return result;
    }
}
