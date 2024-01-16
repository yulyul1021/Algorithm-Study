import java.util.*;
import java.io.*;

public class Main {
  public static void merge(int[] a, int[] b,int sizeA,int sizeB) {
	  int[] temp = new int[sizeA+sizeB];
	  int idx = 0;
	  for(int i=0;i<sizeA;i++) {
		  temp[idx++]=a[i];
	  }
	  for(int i=0;i<sizeB;i++) {
		  temp[idx++]=b[i];
	  }
	  Arrays.sort(temp);
	  
	  StringBuilder sb = new StringBuilder();
	  for(int i = 0;i<temp.length;i++)
		  sb.append(temp[i]).append(" ");
	  
	  System.out.println(sb.toString());

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] arr1 = new int[n];
    int[] arr2 = new int[k];

    st = new StringTokenizer(br.readLine()," ");
    for(int i =0; i<n; i++)
      arr1[i] = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine()," ");
    for(int i =0; i<k; i++)
      arr2[i] = Integer.parseInt(st.nextToken());

    merge(arr1,arr2,n,k);
  }
}
