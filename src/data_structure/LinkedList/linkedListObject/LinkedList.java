package data_structure.LinkedList.linkedListObject;

public class LinkedList {
    private int size;
    private Node head;
    private Node last;

    //构造方法
    public LinkedList() {
        head=last=null;
        size=0;
    }
    //add方法
    public void add(long e){
        Node node=new Node(e);
        if(size==0){
            head=last=node;
            size++;
        }
        else{
            last.next=node;
            node.prev=last;
            last=node;
            size++;
        }
    }
    //add方法
    public void add(int index,long e){
        Node node = new Node(e);
        if(index<0||index>size){
            throw new RuntimeException("");
        }
        if(size==0){
            add(e);
        }
        if(size==1){
            if(index==0){
                node.next=head;
                head.prev=node;
                head=node;
                size++;
            }
            if(index==1){
                node.prev=last;
                last.next=node;
                last=node;
                size++;
            }
        }else{
            if(index==0){
                node.next=head;
                head.prev=node;
                head=node;
                size++;
            }
            else if(index==size){
                node.prev=last;
                last.next=node;
                last=node;
                size++;
            }
            else{
                Node cur=head;
                for (int i = 0; i < index; i++) {
                    cur=cur.next;
                }
                cur.prev.next=node;
                node.prev=cur.prev;
                node.next=cur;
                cur.prev=node;
                size++;
            }
        }
    }
    //删除index处的元素，并且返回该元素的值
    public long remove(int index){
        if(index<0||index>=size){
            throw new RuntimeException("");
        }
        else{
            long val=0;
            if(size==1){
                val=head.val;

                head=last=null;
                size--;
            }
            else if(size==2){
                if(index==0){
                    val= head.val;

                    head=head.next;
                    head.prev=null;
                    size--;
                }
                if(index==1){
                    val= last.val;

                    last=last.prev;
                    last.next=null;
                    size--;
                }
            }
            else{
                if(index==0){
                    val= head.val;

                    head=head.next;
                    head.prev=null;
                    size--;
                }
                else if(index==size-1){
                    val= last.val;

                    last=last.prev;
                    last.next=null;
                    size--;
                }
                else{
                    Node cur=head;
                    for (int i = 0; i < index; i++) {
                        cur=cur.next;
                    }

                    val= cur.val;

                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                    size--;
                }
            }
            return val;
        }
    }
    //获取指定下标的元素
    public long get(int index){
        if(index<0||index>=size){
            throw new RuntimeException("");
        }
        else{
            Node cur=head;
            for (int i = 0; i <index ; i++) {
                cur=cur.next;
            }
            return cur.val;
        }
    }
    //将指定下标的元素修改为指定元素
    public long set(int index,long e){
        if(index<0||index>=size){
            throw new RuntimeException("");
        }
        else{
            Node cur=head;
            for (int i = 0; i <index ; i++) {
                cur=cur.next;
            }
            long oldVal=cur.val;
            cur.val=e;
            return oldVal;
        }
    }
    //输出指定元素的下标，如果没有就输出-1
    public int indexof(long e){
        int index=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.val==e){
                return index;
            }
            index++;
        }
        return -1;
    }
    //链表是否包含指定元素
    public boolean contains(long e){
        return indexof(e) != -1;
    }
    //删除链表出现的指定元素（只删除第一个）
    public void delete(long e){
        int index=indexof(e);
        if(index!=-1){
            remove(index);
        }
    }
    //删除链表出现的指定元素（全部）
    public void deleteAll(long e){
        Node cur=head;
        while(cur!=null){
            if(cur.val==e){
                if(size<=1){
                    head=last=null;
                    size=0;
                }
                else if(size==2){
                    if(cur==head){
                        head=head.next;
                        head.prev=null;
                        size--;
                    }else{
                        last=last.prev;
                        last.next=null;
                        size--;
                    }
                }
                else{
                    if(cur==head){
                        head=head.next;
                        head.prev=null;
                        size--;
                    }else if(cur==last){
                        last=last.prev;
                        last.next=null;
                        size--;
                    }else{
                        cur.prev.next=cur.next;
                        cur.next.prev=cur.prev;
                        size--;
                    }
                }
            }
            cur=cur.next;
        }
    }
    public void deleteAll_2(long e){
        while (contains(e)){
            delete(e);
        }
    }
    public int size(){
        return size;
    }

    public void check(){
        if(size==0){
            if(head!=null||last!=null){
                throw new RuntimeException("");
            }
        }else if(size==1){
            if(head==null||last==null||head!=last){
                throw new RuntimeException("");
            }
            if(head.prev!=null||last.next!=null){
                throw new RuntimeException("");
            }
        }else{
             //检查size是否符合要求
            int aSize=calcSize(head);
            if(size!=aSize){
                throw new RuntimeException("");
            }else {
                //检查头节点
                if(head==null){
                    throw new RuntimeException("");
                }
                if(head.prev!=null){
                    throw new RuntimeException("");
                }
                if(head.next.prev!=head){
                    throw new RuntimeException("");
                }
                //检查尾节点
                if(last==null){
                    throw new RuntimeException("");
                }
                if(last.next!=null){
                    throw new RuntimeException("");
                }
                if(last.prev.next!=last){
                    throw new RuntimeException("");
                }
                //检查中间节点
                Node cur=head.next;
                while(cur!=last){
                    if(cur.next.prev!=cur){
                        throw new RuntimeException("");
                    }
                    if(cur.prev.next!=cur){
                        throw new RuntimeException("");
                    }
                    cur=cur.next;
                }
            }
        }
    }
    private int calcSize( Node head){
        int s=0;
        for (Node c=head;c!=null;c=c.next){
            s++;
        }
        return s;
    }
}
