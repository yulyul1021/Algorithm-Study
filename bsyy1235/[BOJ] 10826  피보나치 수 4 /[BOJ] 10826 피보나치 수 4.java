import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    if(n==0) {
    	System.out.println("0");
    	return ;
    }
    BigInteger Int1 = new BigInteger("1");
    BigInteger Int2 = new BigInteger("1");
    BigInteger tmp = new BigInteger("0");
    
    
    for(int i=2;i<n;i++) {
    	tmp = Int1;
    	Int1 = Int2;
    	Int2 = Int2.add(tmp);
    }
    System.out.println(Int2.toString());
  }
}
