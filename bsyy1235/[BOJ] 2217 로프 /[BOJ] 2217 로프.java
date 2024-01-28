import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i = 0; i<n;i++) {
    	int m = Integer.parseInt(br.readLine());
    	list.add(m);
    }
    
    list.sort(new Comparator<Integer>() {
    	@Override
    	public int compare(Integer o1, Integer o2) {
    		return Integer.compare(o1, o2);
    	}
    });
    
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<list.size();i++) {
    	int k = list.get(i);
    	max = Math.max(max, k*(list.size()-i));
    }
    
    System.out.println(max);


  }
}
