
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
            return null;
        ListNode front=new ListNode(0);
        front.next=head;
        ListNode p=front;
        ListNode q=head;
        while(q.next!=null){
            int val=q.next.val;
            while(p!=q){
                if(p.next.val>val){
                    ListNode succ=p.next;
                    p.next=new ListNode(val);
                    p.next.next=succ;
                    break;
                }
                else
                p=p.next;
            }
            if(p==q){
                q=q.next;
            }
            else
                q.next=q.next.next;
            p=front;
        }
        return front.next;
    }
}
