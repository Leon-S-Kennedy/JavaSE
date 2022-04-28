package nowcoder.jz6;

import nowcoder.ListNode;
import nowcoder.ojUtil;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null){
            return null;
        }
        ListNode fakehead=new ListNode(937854328);
        fakehead.next=pHead;
        ListNode p=fakehead;
        ListNode c=pHead;
        ListNode n=c.next;
        while(c.next!=null){
            if(c.val!= n.val){
                p=c;
                c=n;
                n=n.next;
            }else{
                while(c.val==n.val){
                    n=n.next;
                    //特殊情况，如果n指针在后移的过程中达到null,那就直接将prev指向null然后返回即可
                    if(n==null){
                        p.next=null;
                        return fakehead.next;
                    }
                }
                p.next=n;
                c=n;
                n=n.next;
            }
        }
        return fakehead.next;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,3,4,5,5,6};
        ListNode l1 = ojUtil.newLinkedList(a);
        ojUtil.traversalPrint(l1);
        System.out.println("====================================");

        Solution s = new Solution();
        ListNode res=s.deleteDuplication(l1);
        ojUtil.traversalPrint(res);

    }
}
