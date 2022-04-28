package nowcoder.cm11;

import nowcoder.ListNode;
import nowcoder.ojUtil;

public class Solution {
    public ListNode partition(ListNode pHead, int x) {
        ListNode fakehead1=new ListNode(937854328);
        ListNode last1= fakehead1;
        ListNode fakehead2=new ListNode(1357820039);
        ListNode last2=fakehead2;
        ListNode c=pHead;
        while(c!=null){
            if(c.val<x){
                last1.next=c;
                last1=c;
            }else{
                last2.next=c;
                last2=c;
            }
            c=c.next;
        }
        last1.next=null;
        last2.next=null;
        last1.next=fakehead2.next;
        return fakehead1.next;
    }

    public static void main(String[] args) {
        int[] a={1,4,3,2,5,2};
        ListNode l1 = ojUtil.newLinkedList(a);
        ojUtil.traversalPrint(l1);
        System.out.println("====================================");

        Solution s = new Solution();
        ListNode res=s.partition(l1,3);
        ojUtil.traversalPrint(res);
    }

}
