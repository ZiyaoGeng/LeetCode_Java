/*
先转置，后以中线为基准，进行交换左右两边
 */
public class Solution{
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
            for(int j=i;j<matrix[0].length;j++){
            int temp=0;
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix.length/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
    }
}
