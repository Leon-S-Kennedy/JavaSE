package nowcoder.lastK;

import nowcoder.ListNode;
import nowcoder.ojUtil;

public class Solution {
    public static int length(ListNode head){
        int length=0;
        ListNode c=head;
        while(c!=null){
            c=c.next;
            length++;
        }
        return length;
    }
    public ListNode FindKthToTail2(ListNode head, int k){
        int length=length(head);
        ListNode cur=head;
        if(length<k || k<0){
            return null;
        }
        for (int i = 0; i < length-k; i++) {
            cur=cur.next;
        }
        return cur;
    }
    public ListNode FindKthToTail(ListNode head, int k){
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public ListNode FindKthToTail_my(ListNode head, int k) {
        if(k<=0){
            return null;
        }
        int s=0;
        ListNode slow=null;
        int f=0;
        ListNode fast=head;
        while(fast!=null){
            fast=fast.next;
            f++;
            if(f>=k){
                if(s==0){
                    slow=head;
                    s++;
                }
                else{
                    slow=slow.next;
                    s++;
                }
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        ListNode l1 = ojUtil.newLinkedList(a);
        ojUtil.traversalPrint(l1);
        System.out.println("====================================");

        Solution s = new Solution();
        ListNode res=s.FindKthToTail2(l1,5);
        ojUtil.traversalPrint(res);

    }
}
