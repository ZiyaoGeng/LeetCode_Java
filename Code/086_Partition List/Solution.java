
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode p=head;
        ListNode F=new ListNode(0);
        ListNode L=new ListNode(0);
        ListNode f=F;
        ListNode l=L;
        while(p!=null){
            if(p.val<x){
                f.next=new ListNode(p.val);
                f=f.next;
                p=p.next;
            }
            else{
                l.next=new ListNode(p.val);
                l=l.next;
                p=p.next;
            }
        }
        f.next=L.next;
        return F.next;
    }
    public static void main(String[]args){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(4);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(2);
        listNode.next.next.next.next=new ListNode(5);
        listNode.next.next.next.next.next=
                new ListNode(2);
        new Solution().partition(listNode,3);
    }
}
