
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode low=head;
        while (fast!=null&&fast.next!=null){
            low=low.next;
            fast=fast.next.next;
        }
        ListNode p=reverse(low);
        ListNode Q=new ListNode(0);
        ListNode q=Q;
        while(p!=null){
            q.next=head;
            if(head==p)
                break;
            head=head.next;
            q=q.next;
            q.next=p;
            p=p.next;
            q=q.next;
        }
        head=Q.next;
    }
    public ListNode reverse(ListNode head){
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
