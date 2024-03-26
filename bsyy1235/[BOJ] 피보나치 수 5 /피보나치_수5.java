import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {
    	int ans = 0;
    	if (n==0)
    		return 0;
    	else if(n==1)
    		return 1;
    	else {
    		ans+=solution(n-1)+solution(n-2);
    		return ans;
    	}

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
