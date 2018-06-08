import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        if(root!=null)
        help(list,root,root.val+"->");
        return list;
    }
    public void help(List<String>list,TreeNode root,String s){
        if(root.left==null&&root.right==null){
            s=s.substring(0,s.length()-2);
            list.add(s);
            return;
        }
        if(root.left!=null)
        help(list,root.left,s+root.left.val+"->");
        if(root.right!=null)
        help(list,root.right,s+root.right.val+"->");
    }
}
