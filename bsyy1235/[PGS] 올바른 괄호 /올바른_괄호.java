import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = new char[s.length()];
        for(int i= 0;i<s.length();i++) {
        	ch[i]=s.charAt(i);
        }
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]=='(')
        		stack.push("(");
        	else {
        		if(stack.isEmpty()) {
        			answer = false;
        			break;
        		}
        		stack.pop();
        	}
        }
        if(!stack.isEmpty())
        	answer = false;
        
        return answer;
    }
}
