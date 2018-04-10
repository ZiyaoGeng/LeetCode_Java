
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        ListNode prehead=new ListNode(0);
        prehead.next=head;
        ListNode p=prehead;
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }
            else
                p=p.next;
        }
        return prehead.next;
    }
}
