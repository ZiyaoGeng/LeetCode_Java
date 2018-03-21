
/*
The essential process is:
 to build a tree, we need to pick a root node,
 then we need to know how many possible
 left sub trees and right sub trees can be held under that node,
 finally multiply them.
 */
public class Solution {
    public int numTrees(int n) {
            int [] dp = new int[n+1];
            dp[0]= 1;
            dp[1] = 1;
            for(int level = 2; level <=n; level++)
                for(int root = 1; root<=level; root++)
                    dp[level] += dp[level-root]*dp[root-1];
            return dp[n];
        }
    }
