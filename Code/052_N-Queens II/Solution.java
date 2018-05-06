
public class Solution {
    int count=0;
    public int totalNQueens(int n) {
        int[]store=new int[n];
        total(n,0,store);
        return count;
    }
    public void total(int n,int row,int[] store){
        if(row==store.length)
            count++;
        for(int j=0;j<n;j++){
            if(row>0&&!isVaild(store,row,j))
                continue;
            else {
                store[row]=j;
                total(n, row + 1, store);
            }
        }
    }
    public boolean isVaild(int[]store,int i,int j){
        for(int k=0;k<=i-1;k++){
            if((j-store[k])==0||((i-k)%(j-store[k])==0&&
                    ((i-k)/(j-store[k])==1||(i-k)/(j-store[k])==-1)))
                return false;
        }
        return true;
    }
}
