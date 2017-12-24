/*
保留重复值
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        int l=lists.length;
        boolean flag=l%2!=0?false:true;
        while((l/=2)>0){
            for(int i=0;i<l;i++){
                if(flag==true)
                    lists[i]=mergeLists(lists[i],lists[l+i]);
                else
                    lists[i]=mergeLists(lists[i],lists[l+i+1]);
            }
            if(flag==false)
                l++;
            flag=l%2!=0?false:true;
        }
        return lists[0];
    }
    public ListNode mergeLists(ListNode l1,ListNode l2){
        ListNode list=new ListNode(0);
        ListNode head=list;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next=l1;
                l1=l1.next;
                head=head.next;
            }
            else if(l1.val>l2.val){
                head.next=l2;
                l2=l2.next;
                head=head.next;
            }
            else{
                head.next=new ListNode(l1.val);
                head.next.next=new ListNode(l2.val);
                l1=l1.next;
                l2=l2.next;
                head=head.next.next;
            }
        }
        if(l1!=null)
            head.next=l1;
        if(l2!=null)
            head.next=l2;
        return list.next;
    }
}