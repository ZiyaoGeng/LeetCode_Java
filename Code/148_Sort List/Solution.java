
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode[] l=new ListNode[2];
        l=split(head);
        l[0]=sortList(l[0]);
        l[1]=sortList(l[1]);
        return merge(l[0],l[1]);
    }
    public ListNode[] split(ListNode head){
        ListNode low=head;
        ListNode fast=head.next.next;
        while(fast!=null&&fast.next!=null){
            low=low.next;
            fast=fast.next.next;
        }
        ListNode p=low.next;
        low.next=null;
        ListNode[]l=new ListNode[2];
        l[0]=head;
        l[1]=p;
        return l;
    }
    public ListNode merge(ListNode A,ListNode B){
        ListNode p=A;
        ListNode q=B;
        ListNode mergeList=new ListNode(0);
        ListNode m=mergeList;
        while(p!=null&&q!=null){
            if(p.val<=q.val){
                m.next=p;
                m=m.next;
                p=p.next;
            }
            else{
                m.next=q;
                m=m.next;
                q=q.next;
            }
        }
        if(p!=null)
            m.next=p;
        if(q!=null)
            m.next=q;
        return mergeList.next;
    }
}
