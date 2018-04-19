import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer>row=new ArrayList<>();
        List<Integer>col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                if(!row.contains(i))
                    row.add(i);
                if(!col.contains(j))
                    col.add(j);
            }
        }
        for(int i=0;i<row.size();i++)
            for(int j=0;j<matrix[0].length;j++)
                matrix[row.get(i)][j]=0;
        for(int j=0;j<col.size();j++)
            for(int i=0;i<matrix.length;i++)
                matrix[i][col.get(j)]=0;
    }
}
