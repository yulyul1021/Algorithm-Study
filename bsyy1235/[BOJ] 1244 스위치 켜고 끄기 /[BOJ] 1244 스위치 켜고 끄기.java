import java.util.*;
import java.io.*;

public class Main {
  public static int Switch(int a) {
    if (a == 0)
      return 1;
    else
      return 0;
  }

  public static void boy(int[] list, int n) {
    int a=n;
    while (n <= list.length) {
      list[n-1] = Switch(list[n-1]);
      n += a;
    }
  }

  public static void girl(int[] list, int n) {
    int a = 1;
    n--;
    list[n] = Switch(list[n]);
    while (n - a >= 0 && n + a < list.length) {
      if (list[n - a] == list[n + a]) {
        list[n - a] = Switch(list[n - a]);
        list[n + a] = Switch(list[n + a]);
      } else
        break;
      a++;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int[] stu = new int[n];
    
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      stu[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine(), " ");
    int m = Integer.parseInt(st.nextToken());

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if (a == 1){
        boy(stu, b);
      }
      if (a == 2)
        girl(stu, b);
    }

    StringBuilder sb = new StringBuilder();
    sb.append(stu[0]).append(" ");
    for (int i = 1; i < n; i++) {
      if(i%20==0)
        sb.append("\n");
      sb.append(stu[i]).append(" ");
    }

    System.out.print(sb.toString());

  }
}
