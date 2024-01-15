import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for(int i=0; i<len; i++){
            if(!stack.isEmpty() && s.charAt(i) == stack.peek())
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return (stack.isEmpty()) ? 1 : 0;
    }
}
