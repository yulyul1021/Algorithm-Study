import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int len = String.valueOf(n).length();
    
    int ans = 0;
    int temp = 9;
    
    for(int i=1;i<len;i++) {
    	ans += i *temp;
    	temp *= 10;
    }
    
    ans += (n - Math.pow(10, len-1)+1) * len;
    System.out.print(ans);

  }
}
