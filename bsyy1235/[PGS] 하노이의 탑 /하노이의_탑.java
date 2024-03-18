import java.util.*;

class Solution {
	StringBuilder sb = new StringBuilder();
	
	public void Hanoi(int n, int before, int tmp, int after){
		if(n==1) {
			sb.append(before).append(" ").append(after).append("\n");

		}
		else {
			Hanoi(n-1,before,after,tmp);
			sb.append(before).append(" ").append(after).append("\n");
			Hanoi(n-1,tmp,before,after);

		}
	}
	
    public int[][] solution(int n) {
        int[][] answer = new int[(int)(Math.pow(2, n)-1)][2];
        Hanoi(n,1,2,3);
        String[] tmp = sb.toString().split("\n");
        
        for(int i=0;i<tmp.length;i++) {
        	String[] temp = tmp[i].split(" ");
        	answer[i][0] = Integer.parseInt(temp[0]);
        	answer[i][1] = Integer.parseInt(temp[1]);
        }

        return answer;
    }
}
