
/*
 * ɾȥһ������������ظ�Ԫ��
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null)
    		return null;
        ListNode front=head;
        ListNode p=head.next;
        while(p!=null){
        	if(p.val!=front.val){
        		front=front.next;
        	}
        	else{
        		front.next=p.next;
        	}
        	p=p.next;
        }
        return head;
    }
}