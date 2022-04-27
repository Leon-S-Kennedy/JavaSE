package leetcode.p160;

import leetcode.linklist206.ListNode;
import leetcode.ojUtil;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la=length(headA);
        int lb=length(headB);
        ListNode pa=headA;
        ListNode pb=headB;
        if(la<lb){
            for (int i=0;i<lb-la;i++){
                pb=pb.next;
            }
            while(pa!=pb){
                pa=pa.next;
                pb=pb.next;
            }
            if(pa==null){
                return pa;
            }else{
                return pa;
            }
        }else{
            for (int i=0;i<la-lb;i++){
                pa=pa.next;
            }
            while(pa!=pb){
                pa=pa.next;
                pb=pb.next;
            }
            if(pa==null){
                return pa;
            }else{
                return pa;
            }
        }
    }
    public static int length(ListNode head){
        int length=0;
        ListNode c=head;
        while (c!=null){
            c=c.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={3,4};
        int[] c={12345,3,4};
        ListNode l1 = ojUtil.newLinkedList(a);
        ListNode l2 = ojUtil.newLinkedList(b);
        ListNode l3 = ojUtil.newLinkedList(c);
        l1=lastAdd(l1,l3);
        l2=lastAdd(l2,l3);

        Solution s = new Solution();
        ListNode newhead=s.getIntersectionNode(l1,l2);
        System.out.println(newhead.val);
    }

    private static ListNode lastAdd(ListNode a, ListNode b) {
        if(a==null){
            return b;
        }
        ListNode c=a;
        while(c.next!=null){
            c=c.next;
        }
        c.next=b;
        return a;
    }
}
