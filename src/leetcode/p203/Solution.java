package leetcode.p203;

import leetcode.linklist206.ListNode;

public class Solution {
    //假头法
    public ListNode removeElements2(ListNode head, int val){
        ListNode fakehead=new ListNode(937854328);
        fakehead.next=head;
        ListNode prev=fakehead;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return fakehead.next;
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead=head;
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            if(cur.val==val){
                if(prev==null){
                    newHead=newHead.next;
                }else{
                    prev.next=cur.next;
                }
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(2);
        ListNode n5=new ListNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        ListNode head=n1;
        traversalPrint(head);
        System.out.println("===========================");

        Solution solution = new Solution();
        ListNode l1 = solution.removeElements(head, 2);
        traversalPrint(l1);
    }
    public static void traversalPrint(ListNode head){
        for(ListNode cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.val+"->");
        }
        System.out.println("null");
    }

}
