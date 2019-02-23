package Algorithms;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Problem_2_Add_Two_Numbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;
        ListNode res = null;
        ListNode cur;
        ListNode pre = null;
        int tmp;
        // if the sum of current two bits is not less than 10, then need to add the carry bit to next two bits
        int carry_bit = 0;
        while (left != null || right != null || 0 != carry_bit) {
            tmp = (null == left ? 0 : left.val) + (null == right ? 0 : right.val) + carry_bit;
            carry_bit = tmp / 10;
            tmp = tmp % 10;
            cur = new ListNode(tmp);
            if (null == res) {
                res = cur;
                pre = cur;
            }
            else {
                pre.next = cur;
                pre = cur;
            }
            left = (null == left ? null : left.next);
            right = (null == right ? null : right.next);
        }
        return res;
    }
}
