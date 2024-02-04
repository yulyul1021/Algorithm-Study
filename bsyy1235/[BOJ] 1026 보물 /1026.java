import java.util.*;
import java.io.*;

public class Main {
  static int[] c;
  static int[] d;

  public static int max(int[] b, int n) {

    int max = -1;
    int max_index = 0;

    for (int i = 0; i < n; i++) {
      if (max < b[i] && d[i] == -1) {
        max = b[i];
        max_index = i;
      }
    }

    d[max_index] = 1;
    return max_index;
  }

  public static int min(int[] a, int n) {
    int min = 100;
    int min_index = 0;
    
    for (int i = 0; i < n; i++) {
      if (min >= a[i] && c[i] == -1) {
        min = a[i];
        min_index = i;
      }
    }
    c[min_index] = 1;
    return min_index;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int[] a = new int[n];
    int[] b = new int[n];
    c = new int[n];
    d = new int[n];

    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
      c[i] = -1;
    }


    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      b[i] = Integer.parseInt(st.nextToken());
      d[i] = -1;
    }

    int ans = 0;
    int[] e = new int[n];
    for (int i = 0; i < n; i++) {
    	int mini = min(a,n);
    	int maxi = max(b,n);
    	e[maxi] = a[mini];
    }

    for (int i = 0; i < n; i++) {
      ans += e[i] * b[i];
    }

    System.out.print(ans);

  }
}
