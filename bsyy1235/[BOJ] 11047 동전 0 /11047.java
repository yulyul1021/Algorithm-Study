import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }
    int tmp;
    int coin = 0;
    for(int i = n-1;i>=0;i--) {
    	tmp = k/a[i];
    	coin+=tmp;
    	k-=tmp*a[i];
    }

    System.out.print(coin);

  }
}
