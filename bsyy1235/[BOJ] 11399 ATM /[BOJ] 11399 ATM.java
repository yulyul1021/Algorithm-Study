import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int[] array = new int[n];

    st = new StringTokenizer(br.readLine()," ");
    for(int i = 0; i < n; i++){
      array[i]=Integer.parseInt(st.nextToken());
    }

    Arrays.sort(array);
    int sum = 0;
    int[] sumlist = new int[n];

    for(int i = 0; i < n; i++){
      sum+=array[i];
      sumlist[i] = sum;
    }

    sum=0;
    for(int i=0;i<n;i++){
      sum+=sumlist[i];
    }
    System.out.println(sum);

    
  }
}
