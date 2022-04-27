package leetcode.p21;

import leetcode.linklist206.ListNode;
import leetcode.ojUtil;

public class Solution {

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2){
        ListNode newhead = new ListNode(937854328);
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode newlast = newhead;
        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                newlast.next=c1;
                c1 = c1.next;
            } else {
                newlast.next=c2;
                c2 = c2.next;
            }
            newlast=newlast.next;
        }
        if (c1 == null) {
            newlast.next = c2;
        } else {
            newlast.next = c1;
        }
        return newhead.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newhead = null;
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode newlast = null;
        if (c1 == null) {
            return c2;
        }
        if (c2 == null) {
            return c1;
        }
        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                if (newhead == null) {
                    newhead = c1;
                } else {
                    newlast.next = c1;
                }
                newlast = c1;
                c1 = c1.next;
            } else {
                if (newhead == null) {
                    newhead = c2;
                } else {
                    newlast.next = c2;
                }
                newlast = c2;
                c2 = c2.next;
            }
        }
        if (c1 == null) {
            newlast.next = c2;
        } else {
            newlast.next = c1;
        }
        return newhead;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1, 3, 4, 6, 8};
        ListNode l1 = ojUtil.newLinkedList(a);
        ListNode l2 = ojUtil.newLinkedList(b);
        Solution s = new Solution();
        ListNode newhead = s.mergeTwoLists2(l1, l2);
        ojUtil.traversalPrint(newhead);
    }
}
