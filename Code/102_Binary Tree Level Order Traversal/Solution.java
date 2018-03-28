import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int level=1;
        while(!queue.isEmpty()){
            int newLevel=0;
            List<Integer>list1=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode node=queue.poll();
                list1.add(node.val);
                if(node.left!=null) {
                    queue.offer(node.left);
                    newLevel++;
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                    newLevel++;
                }
            }
            list.add(list1);
            level=newLevel;
        }
        return list;
    }
}
