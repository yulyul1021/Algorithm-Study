import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

	boolean[] isPrime = new boolean[m+1];
	Arrays.fill(isPrime , true);
    
	isPrime [0] = isPrime [1] = false;
	for(int i=2; i*i<=m; i++){
		if(isPrime[i]){
			for(int j=i*i; j<=m; j+=i) {
				isPrime[j] = false;                
			}
		}        
	}    

	for(int i=n; i<=m ;i++){
		if(isPrime[i]) 
			System.out.println(i);        
	}
  }
}
