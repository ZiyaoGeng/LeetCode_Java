import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeLinkNode{
    int val;
    TreeLinkNode left,right,next;
    public TreeLinkNode(int val){
        this.val=val;
    }
}
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        Queue<TreeLinkNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            TreeLinkNode left=queue.remove();
            if(left.left!=null)
                queue.add(left.left);
            if(left.right!=null)
                queue.add(left.right);
            for(int i=1;i<size;i++){
                TreeLinkNode right=queue.remove();
                if(right.left!=null)
                    queue.add(right.left);
                if(right.right!=null)
                    queue.add(right.right);
                left.next=right;
                left=right;
            }
            left.next=null;
        }
    }
}
