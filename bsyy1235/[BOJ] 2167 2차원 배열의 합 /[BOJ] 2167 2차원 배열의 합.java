import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    
    for(int i = 0 ;i<n;i++){
      for(int j = 0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int k = sc.nextInt();
    for(int v = 0 ;v<k;v++){
      int i = sc.nextInt();
      int j = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = 0;
      for(int a = i-1 ; a<x ; a++){
        for(int b = j-1 ; b<y ; b++){
          sum+=arr[a][b];
        }
      }
      System.out.println(sum);
    }
    
    sc.close();
  }
}
