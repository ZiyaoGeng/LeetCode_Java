/*
交换相邻的元素
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode listNode=new ListNode(0);
        ListNode p=listNode;
        while(head!=null&&head.next!=null){
            ListNode two=null;
            ListNode succ=head.next.next;
            head.next.next=two;
            two=head;
            p.next=reverse(two);
            p=p.next.next;
            head=succ;
        }
        if(head!=null)
            p.next=head;
        return listNode.next;
    }
    private ListNode reverse(ListNode list){
        ListNode front=null;
        ListNode p=list;
        while(p!=null){
            ListNode succ=p.next;
            p.next=front;
            front=p;
            p=succ;
        }
        return front;
    }
}
