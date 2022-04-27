package leetcode.p142;

import leetcode.linklist206.ListNode;
import leetcode.ojUtil;
public class Solution {
    public ListNode detectCycle_well(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null){
            f=f.next;
            if(f==null){
                return null;
            }
            f=f.next;
            if(f==null){
                return null;
            }
            s=s.next;
            if(s==f){
                break;
            }
        }
        ListNode c=head;
        while (c!=s){
            c=c.next;
            s=s.next;
        }
        return c;
    }
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
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        ListNode newhead=head;
        while(f!=null){
            f=f.next;
            if(f==null){
                return null;
            }
            f=f.next;
            if(f==null){
                return null;
            }
            s=s.next;
            if(s==f){
                newhead=s.next;
                s.next=null;
                break;
            }
        }
        return getIntersectionNode(head,newhead);
    }

    public static void main(String[] args) {
        int[] a={1234123,2,3,4,5,6,7};
        int[] b={};
        ListNode l1 = ojUtil.newLinkedList(a);
        ListNode l2 = ojUtil.newLinkedList(b);
        l1=lastAdd(l1,l1);
        Solution s = new Solution();

        System.out.println(s.detectCycle_well(l1).val);
        System.out.println(s.detectCycle(l2));

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
