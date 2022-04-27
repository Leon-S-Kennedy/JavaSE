package leetcode.p138;
import leetcode.ojUtil;
public class Solution {
    public Node copyRandomList(Node head) {

        //1.遍历链表，将每个节点插入到对应的老节点的后面
        Node cur=head;
        while (cur!=null){
            Node newnode=new Node(cur.val);

            newnode.next=cur.next;
            cur.next=newnode;

            cur=newnode.next;
        }
        //2.记录random信息
        Node c=head;
        while (c!=null){
            Node n=c.next;
            Node cRandom=c.random;
            if(c.random==null){
                n.random=null;
                c=n.next;
            }else{
                n.random=cRandom.next;
                c=n.next;
            }
        }
        //3.将复制的链表剪出来
        Node h1=head;
        Node newhead=head.next;       //此处用来保存新链表的头节点
        while (h1!=null){
            Node h2=h1.next;
            h1.next=h1.next.next;
            if(h2.next!=null){
                h2.next=h2.next.next;
            }
/*
            else{
                h2.next=null;   //此处可以不写，因为必定为null
            }
*/
            h1=h1.next;
        }
        //4.返回新链表的头节点
        return newhead;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        node1.random=node2;
        node2.random=node2;
        node3.random=null;
        node4.random=node1;
        Node newhead = s.copyRandomList(node1);
    }
}
