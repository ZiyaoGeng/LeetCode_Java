
/*
按部就班
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int i=0,j=0;
        boolean flag1=true,flag2=true;//flag2优先级大于1
        if(matrix.length==0)
            return list;
        int m=matrix.length;
        int n=matrix[0].length;
        while(true){
            if(list.size()==matrix.length*matrix[0].length)
                break;
            else if(flag2==true&&flag1==true){
                if(j>=0&&j<n) {
                    if (list.contains(matrix[i][j])) {
                        j--;
                        i++;
                        flag2 = false;
                    }
                    else
                        list.add(matrix[i][j++]);
                }
                else {
                    flag2 = false;
                    j--;
                    i++;
                }
            }
            else if(flag1==true&&flag2==false){
                if(i>=0&&i<m) {
                    if (list.contains(matrix[i][j])){
                        i--;
                        j--;
                        flag1=false;
                    }
                    else
                        list.add(matrix[i++][j]);
                }
                else {
                    flag1=false;
                    i--;
                    j--;
                }
            }
            else if(flag2==false&&flag1==false){
                if(j>=0&&j<n){
                    if(list.contains(matrix[i][j])) {
                        flag2 = true;
                        j++;
                        i--;
                    }
                    else
                        list.add(matrix[i][j--]);
                }
                else {
                    flag2=true;
                    j++;
                    i--;
                }
            }
            else if(flag1==false&&flag2==true){
                if(i>=0&&i<m){
                    if(list.contains(matrix[i][j])) {
                        flag1 = true;
                        i++;
                        j++;
                    }
                    else
                        list.add(matrix[i--][j]);
                }
            }
        }
        return list;
    }
}
