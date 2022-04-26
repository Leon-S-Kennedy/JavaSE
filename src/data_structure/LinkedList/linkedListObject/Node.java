package data_structure.LinkedList.linkedListObject;

public class Node {
    public long val;
    public Node prev;
    public Node next;

    public Node(long val) {
        this.val = val;
    }

    public Node(long val, Node prev, Node next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
