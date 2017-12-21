import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c=='('||c=='['||c=='{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                else{
                    if(c==')')
                        if(stack.pop()!='(')
                            return false;
                    if(c==']')
                        if(stack.pop()!='[')
                            return false;
                    if(c=='}')
                        if(stack.pop()!='{')
                            return false;
                }
            }
        }
        if(stack.size()!=0)
            return false;
        else
            return true;
    }
    public static void main(String[]args){
        System.out.println(new Solution().isValid("}"));
    }
}
