
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode p1=l1;  //移动的结点
		 ListNode p2=l2;
		 ListNode l=new ListNode(0);
		 ListNode cur=l;  //在l上移动的结点
		 int c=0;    //进位数
		 while(p1!=null||p2!=null){
			 int x=(p1!=null)?p1.val:0;  //取值
			 int y=(p2!=null)?p2.val:0;
			 cur.next=new ListNode((x+y+c)%10);
			 cur=cur.next;
			 c=(x+y+c)/10;
			 if(p1!=null)p1=p1.next;
			 if(p2!=null)p2=p2.next;
		 }
		 if(c>0)
			 cur.next=new ListNode(1);
		 return l.next;
	 }
}
