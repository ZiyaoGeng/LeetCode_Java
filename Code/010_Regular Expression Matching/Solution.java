
class Solution {
      public boolean isMatch(String s, String p) {
          return myMatch(s,s.length()-1,p,p.length()-1);
}
      public boolean myMatch(String s,int i,String p,int j){
          if(j==-1)
              if(i==-1)
                  return true;
          else
              return false;
          if(p.charAt(j)=='*') {
              if (i > -1 && (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i)))
                  if (myMatch(s, i - 1, p, j))
                      return true;
              return myMatch(s, i, p, j - 2);
          }
          if(i>-1&&(p.charAt(j)=='.'||p.charAt(j)==s.charAt(i)))
              return myMatch(s,i-1,p,j-1);
          else
              return false;
      }
}
