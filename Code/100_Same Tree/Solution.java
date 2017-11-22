
//  Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p!=null&&q!=null){
			if(p.val==q.val)
				return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
			else
				return false;
		}
		if((p==null&&q!=null)||p!=null&&q==null)
			return false;
		else
			return true;
	}
	public static void main(String[]args){
		TreeNode t=new TreeNode(0);
		t.left=new TreeNode(1);
		TreeNode t2=new TreeNode(0);
		t2.left=new TreeNode(1);
		System.out.println(new Solution().isSameTree(t, t2));
	}
}