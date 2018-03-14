
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)
            return head;
        ListNode headCopy=new ListNode(0);
        int count=0;
        ListNode head2=head;
        for(ListNode copy=headCopy;head2!=null;head2=head2.next){
            copy.next=new ListNode(head2.val);
            copy=copy.next;
            count++;
        }
        ListNode p=reverse(head);
        ListNode listNode=new ListNode(0);
        ListNode l1=listNode;
        if(k>count)
        k=k%count;
        if(k==0)
            return headCopy.next;
        for(int i=0;i<k;i++){
            l1.next=new ListNode(p.val);
            l1=l1.next;
            p=p.next;
        }
        ListNode listNode2=reverse(listNode.next);
        ListNode l2=listNode2;
        if(p==null)
            return listNode2;
        while (l2.next!=null)
            l2=l2.next;
        for(int i=0;i<count-k;i++){
            l2.next=new ListNode(headCopy.next.val);
            l2=l2.next;
            headCopy=headCopy.next;
        }
        return listNode2;
    }
    public ListNode reverse(ListNode head){
        ListNode p=head;
        ListNode front=null;
        while(p!=null){
            ListNode q=p.next;
            p.next=front;
            front=p;
            p=q;
        }
        return front;
    }
}

