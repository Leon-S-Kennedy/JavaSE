package nowcoder.or36;

import nowcoder.ListNode;
import nowcoder.ojUtil;

public class Solution {
    public boolean chkPalindrome(ListNode A) {
        ListNode prev=null;
        ListNode cur=A;
        while(cur!=null){
            ListNode next=cur.next;

            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode l1=A;
        ListNode l2=prev;
        while (l1!=null){
            if(l1.val!= l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a={5,4,3,2,1,1,2,3,4,5};
        int[] b={1,2,3,4,5};
        ListNode l1 = ojUtil.newLinkedList(a);
        ListNode l2 = ojUtil.newLinkedList(b);
        Solution s = new Solution();
        System.out.println(s.chkPalindrome(l1));
        System.out.println(s.chkPalindrome(l2));
    }
}
