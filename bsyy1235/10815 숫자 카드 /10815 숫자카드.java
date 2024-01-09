import java.util.*;

public class Main {

  static boolean binarySearch(int[] arr, int x){
    int left = 0;
    int right = arr.length - 1;

    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid] > x){
        right = mid -1;
      }
      else if(arr[mid] < x){
        left = mid + 1; 
      }
      else
        return true;
    }
    return false;
  }

  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i=0;i<n;i++){
      array[i] = sc.nextInt();
    }
    
    int m = sc.nextInt(); 
    int[] array2 = new int[m];
    for(int i=0;i<m;i++){
      array2[i] = sc.nextInt();
    }

    Arrays.sort(array);

    for(int i : array2){
      if(binarySearch(array,i))
        System.out.print(1+" ");
      else
        System.out.print(0+" ");
    }

    sc.close();
  }
}
