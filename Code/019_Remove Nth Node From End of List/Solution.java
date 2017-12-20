
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode reverseNode=reverse(head);
    	ListNode heads=reverseNode;
    	int j=1;
    	if(reverseNode.next==null)
    		return null;
    	if(n==1){
    		heads=heads.next;
    		return reverse(heads);
    	}
    	while(heads!=null&&j<n-1){
    		heads=heads.next;
    		j++;
    	}
    	if(heads==null)
    		return null;
    	else
    		heads.next=heads.next.next;
    	return reverse(reverseNode);
    }
    public static ListNode reverse(ListNode head){
    	ListNode front=null;
    	while(head!=null){
    	ListNode succ=head.next;
    	head.next=front;
    	front=head;
    	head=succ;
    	}
    	return front;
    }
}
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x;}
	      }