import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static int[] intArray(int A) {
    	String str = Integer.toString(A);
    	int[] a = new int[str.length()];
    	for(int i = 0 ;i<str.length();i++) {
    		a[i] = str.charAt(i)-'0';
    	}
    	return a;
	}
	
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int A = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    list.add(A);
    
    while(true) {
    	int[] a = intArray(A);
    	int tmp = 0;
    	for(int i=0;i<a.length;i++) {
    		tmp+=Math.pow(a[i],P);
    	}

    	if(list.contains(tmp)) {
    		for(int i=0;i<list.size();i++) {
    			if(list.get(i)==tmp) {
    				break;
    			}
    			list2.add(list.get(i));
    		}
    		break;
    	}
    	else
    		list.add(tmp);
    	A=tmp;
    }
    
    System.out.println(list2.size());
    

  }
}
