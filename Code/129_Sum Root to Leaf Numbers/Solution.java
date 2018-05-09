import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        this.val=x;
    }
}
public class Solution {
    public int sumNumbers(TreeNode root) {
        int total=0;
        List<Integer>list=new ArrayList<>();
        if(root!=null)
        sum(root,"",list);
        for(Integer i:list)
            total+=i;
        return total;
    }
    public void sum(TreeNode root, String s, List<Integer>list){
        if(root.right==null&&root.left==null)
            list.add(Integer.valueOf(s+root.val));
        else{
            if(root.left!=null)
                sum(root.left,s+root.val,list);
            if(root.right!=null)
                sum(root.right,s+root.val,list);
        }
    }
}
