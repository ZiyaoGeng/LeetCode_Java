
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=head;
        ListNode front=null;
        while(p!=null){
            ListNode succ=p.next;
            p.next=front;
            front=p;
            p=succ;
        }
        return front;
    }
}
