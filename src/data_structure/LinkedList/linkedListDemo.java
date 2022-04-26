package data_structure.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {

        {
            //表示一个空的(empty)链表
            listNode head=null;
            head=lastAdd(head,1);
        }
        {
            //表示只有一个节点的链表
            listNode head=new listNode();
            head.val=2021;
            head.next=null;
        }
        {
            //表示多个节点的链表
            listNode n1=new listNode(100);
            listNode n2=new listNode(200);
            listNode n3=new listNode(300);
            listNode n4=new listNode(400);

            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=null;

            listNode head=n1;
            head=headAdd(head,10000);
            traversalPrint(head);
            System.out.println("============================");
            head=headDelete(head);
            traversalPrint(head);
            System.out.println("============================");
            head=lastAdd(head,999);
            traversalPrint(head);
            System.out.println("============================");
            head=lastDelet(head);
            traversalPrint(head);


            //链表元素的遍历
/*
            listNode cur=head;
            while(cur!=null){//此处为什么不是cur.next呢？因为如果是这样的话，当cur=n4的时候，判cur。next为null这样就不会输出n4.val了。
                System.out.println(cur.val);
                cur=cur.next;
            }
*/

        }
    }
    public static void traversalPrint(listNode head){
        for(listNode cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }
    public static listNode headAdd(listNode head,long e){
        listNode node =new listNode(e);
        node.next=head;
        return node;
    }

    //！！！前提是至少有一个节点哦！！！
    public static listNode headDelete(listNode head){
        return head.next;
    }

    public static listNode lastAdd(listNode head,long e){

        listNode node=new listNode(e);
        if(head==null){
            return node;
        }
        listNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
        return head;
    }
    public static listNode lastDelet(listNode head){
        for(listNode cur=head;cur!=null;cur=cur.next){
            if(cur.next.next==null){
                cur.next=null;
            }
        }
        return head;
    }
}
