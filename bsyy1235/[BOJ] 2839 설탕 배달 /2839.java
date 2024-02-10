import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int count = 0;
    
    while(N!=0) {
    	if(N<3) {
    		count=-1;
    		break;
    	}
    	if(N%5==0) {
    		N-=5;
    		count++;
    	}
    	else {
    		N-=3;
    		count++;
    	}
    }

    System.out.print(count);

  }
}
