import java.util.HashMap;

class RandomListNode{
    int label;
    RandomListNode next, random;
    public RandomListNode(int val){
        this.label =val;
    }
}
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode,RandomListNode>store=new HashMap<>();
        RandomListNode p=head;
        RandomListNode copy=new RandomListNode(0);
        RandomListNode cp=copy;
        while(p!=null){
            if(store.containsKey(p))
                cp.next = store.get(p);
            else {
                cp.next = new RandomListNode(p.label);
                store.put(p,cp.next);
            }
            if(p.random !=null){
                if(store.containsKey(p.random))
                    cp.next.random =store.get(p.random);
                else {
                    cp.next.random =new RandomListNode(p.random.label);
                    store.put(p.random,cp.next.random);
                }
            }
            p=p.next;
            cp=cp.next;
        }
        return copy.next;
    }
}
