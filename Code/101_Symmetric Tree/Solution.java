
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        TreeNode left=root.left;
        TreeNode right=root.right;
        return isSameTree(left,right);

    }
    public boolean isSameTree(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if((left==null&&right!=null)||(left!=null&&right==null))
            return false;
        if(left.val==right.val){
            return isSameTree(left.left,right.right)&&
                    isSameTree(left.right,right.left);
        }
        else
            return false;
    }
}
