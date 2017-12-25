
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p=head;
        ListNode listNode=new ListNode(0);
        ListNode list=listNode;
        while(p!=null) {
            int counter = 0;
            ListNode kList =new ListNode(0);
            ListNode kl=kList;
            while (p!= null && counter < k) {
                kl.next=new ListNode(p.val);
                p=p.next;
                kl=kl.next;
                counter++;
            }
            if(counter==k) {
                 list.next= reverse(kList.next);
                while(list.next!=null){
                    list=list.next;
                }
            }
            else
                list.next=kList.next;
        }
        return listNode.next;
    }
    private ListNode reverse(ListNode p){
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
