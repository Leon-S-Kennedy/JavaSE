package leetcode.p876;

import leetcode.linklist206.ListNode;
import leetcode.ojUtil;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        int n=0;
        while(f!=null){
            f=f.next;
            n++;
            if(n%2==0){
                s=s.next;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        ListNode l1 = ojUtil.newLinkedList(a);
        ojUtil.traversalPrint(l1);
        System.out.println("================================");

        Solution s = new Solution();
        ListNode newhead = s.middleNode(l1);
        ojUtil.traversalPrint(newhead);
    }
}
