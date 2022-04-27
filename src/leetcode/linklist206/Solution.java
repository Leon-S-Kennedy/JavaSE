package leetcode.linklist206;

public class Solution {
    public ListNode reverseList2(ListNode head){
        ListNode fakehead=new ListNode(937854328);
        fakehead.next=head;
        ListNode cur=head;
        ListNode prev=fakehead;
        if(head==null){
            return null;
        }
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=null;
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;

        while(cur!=null){
            ListNode next=cur.next;//由于直接改变节点指向会导致无法访问到下一个节点，所以需要在开始改变之前记录下次节点

            cur.next=prev;         //将当前的节点的指向改成前一个节点

            prev=cur;              //前向节点加一，
            cur=next;              //当前接节点向后
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        ListNode head=n1;
        traversalPrint(head);
        System.out.println("===========================");

        Solution solution = new Solution();
        ListNode r=solution.reverseList(head);
        traversalPrint(r);

        ListNode v=null;
        ListNode l1 = solution.reverseList(v);
        traversalPrint(l1);
    }

    public static void traversalPrint(ListNode head){
        for(ListNode cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.val+"->");
        }
        System.out.println("null");
    }
}
