package nowcoder;

public class ListNode {
    public long val;
    public ListNode next;

    public ListNode(){

    }
    public ListNode(long val) {
        this.val = val;
    }
    public ListNode(int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
}
