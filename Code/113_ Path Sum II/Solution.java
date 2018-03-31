import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public List<List<Integer>>pathSum(TreeNode root, int sum){
        List<List<Integer>>list=new ArrayList<>();
        oneSum(list,new ArrayList<>(),root,sum);
        return list;
    }
    public void oneSum(List<List<Integer>>list,
                       ArrayList<Integer>list1,
                       TreeNode root,int sum){
        if(root==null)
            return;
        else if(root.left==null&&root.right==null&&sum-root.val==0){
            List<Integer>list2=new ArrayList<>(list1);
            list2.add(root.val);
            list.add(list2);
        }
        else{
            list1.add(root.val);
            oneSum(list,new ArrayList<>(list1),root.left,sum-root.val);
            oneSum(list,new ArrayList<>(list1),root.right,sum-root.val);
        }
    }
}
