
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode rl1=reverse(l1);
		ListNode rl2=reverse(l2);
		ListNode p1=rl1;
		ListNode p2=rl2;
		int c=0;
		ListNode cur=new ListNode(0);
		ListNode p=cur;
		while(p1!=null||p2!=null){
			int x=(p1!=null)?p1.val:0;
			int y=(p2!=null)?p2.val:0;
			p.next=new ListNode((x+y+c)%10);
			c=(x+y+c)/10;
			if(p1!=null)p1=p1.next;
			if(p2!=null)p2=p2.next;
			p=p.next;
		}
		if(c==1)
			p.next=new ListNode(1);
		return reverse(cur.next);
    }
	public ListNode reverse(ListNode l){
		ListNode front=null;
		ListNode p=l;
		while(p!=null){
			ListNode q=p.next;
			p.next=front;
			front=p;
			p=q;
		}
		return front;
	}
}
