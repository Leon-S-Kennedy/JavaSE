package leetcode;

import leetcode.linklist206.ListNode;

public class ojUtil {
    public static ListNode newLinkedList(int[] array){
        ListNode head =null;
        for (int i : array) {
            head=lastAdd(head,i);
        }
        return head;
    }
    public static long[] LinkedListToArray(ListNode head){
        int size=0;
        for (ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        long[] array=new long[size];
        ListNode cur;
        int i;
        for(cur=head,i=0;cur!=null&&i<size;cur=cur.next,i++){
            array[i]= cur.val;
        }
        return array;
    }
    public static ListNode lastAdd(ListNode head, long e){
        if(head==null){
            return new ListNode(e);
        }
        ListNode cur=head;
        while(cur.next!=null){      //此时为何不是cur.next呢？因为此时判定方式是下个节点不为空就到下个节点。
            cur=cur.next;
        }
        cur.next=new ListNode(e);
        return head;
    }

    public static void main(String[] args) {
        int[] array={};
        ListNode l1 = newLinkedList(array);
        traversalPrint(l1);
        long[] longs = LinkedListToArray(l1);
        for (long aLong : longs) {
            System.out.print(aLong+"  ");
        }
    }

    public static void traversalPrint(ListNode head) {
        for(ListNode cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.val+"->");
        }
        System.out.println("null");
    }
}
