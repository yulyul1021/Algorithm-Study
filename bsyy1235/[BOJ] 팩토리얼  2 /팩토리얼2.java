import java.util.*;
import java.io.*;

class Solution {
	long ans = 1;
    public long solution(int n) {
    	if(n==0)
    		return ans;
    	else {
    		ans *= n;
    		solution(n-1);
    	}
    	return ans;
    }
}

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution sol = new Solution();
		int a = Integer.parseInt(br.readLine());
		System.out.println(sol.solution(a));
		
	}
}
