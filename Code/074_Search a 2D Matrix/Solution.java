
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i;
        if(matrix.length>0&&matrix[0].length==0)
            return false;
        for(i=0;i<matrix.length;i++)
            if (matrix[i][0] > target)
                break;
        if(i-1<0||i-1==matrix.length)
            return false;
        if(matrix[i-1][0]==target)
            return true;
        for(int j=1;j<matrix[i-1].length;j++){
            if(matrix[i-1][j]==target)
                return true;
            if(matrix[i-1][j-1]<target&&matrix[i-1][j]>target)
                return false;
        }
        return false;
    }
}
