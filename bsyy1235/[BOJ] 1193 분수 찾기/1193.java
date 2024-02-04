import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    
    int count = 1;
    int sum = 0;
    
    while(true) {
    	if(n <= sum+count) {
    		if(count%2==1) {
    			System.out.println((count - (n - sum - 1 )) +"/"+(n-sum));
    			break;
    		}
    		else {
    			System.out.println((n-sum)+"/"+(count-(n-sum-1)));
    			break;
    		}
    	}
    	else {
    		sum+=count;
    		count++;
    	}
    }
    
    
	System.out.println();        

  }
}
