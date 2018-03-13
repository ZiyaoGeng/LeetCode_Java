/*
DP µÝ¹éÓë·ÇµÝ¹é
 */
public class Solution {
//    public int minPathSum(int[][] grid) {
//        if(grid.length==0)
//            return 0;
//        int[][]Subsum=new int[grid.length][grid[0].length];
//        return minSum(grid,Subsum,
//                grid.length-1,grid[0].length-1);
//    }
//    public int minSum(int[][]grid,int[][]Subsum,int i,int j){
//        if(i==0&&j==0)
//            return Subsum[i][j]=grid[0][0];
//        else if(i>0&&j==0)
//            return Subsum[i][j]=minSum(grid,Subsum,i-1,j)+grid[i][j];
//        else if(j>0&&i==0)
//            return Subsum[i][j]=minSum(grid,Subsum,i,j-1)+grid[i][j];
//        else {
//            return Subsum[i][j] = Math.min(
//                    minSum(grid, Subsum, i - 1, j),
//                    minSum(grid, Subsum, i, j - 1))
//                    + grid[i][j];
//        }
      public int minPathSum(int[][] grid) {
          if(grid.length==0)
            return 0;
          int[][]Subsum=new int[grid.length][grid[0].length];
          Subsum[0][0]=grid[0][0];
          for(int i=1;i<grid.length;i++)
              Subsum[i][0]=Subsum[i-1][0]+grid[i][0];
          for(int j=1;j<grid[0].length;j++)
              Subsum[0][j]=Subsum[0][j-1]+grid[0][j];
          for(int i=1;i<Subsum.length;i++){
              for(int j=1;j<Subsum[0].length;j++)
                  Subsum[i][j]=Math.min(Subsum[i-1][j],Subsum[i][j-1])+grid[i][j];
          }
          return Subsum[grid.length-1][grid[0].length-1];
     }
}
