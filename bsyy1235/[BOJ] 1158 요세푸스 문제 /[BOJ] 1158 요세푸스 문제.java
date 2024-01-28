import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    LinkedList<Integer> list = new LinkedList<>();
    
    for(int i =1;i<=n;i++) {
    	list.add(i);
    }
    sb.append("<");
    while(!list.isEmpty()) {
    	for(int i=0;i<k-1;i++) {
    		list.add(list.get(0));
    		list.remove(0);
    	}
    	sb.append(list.get(0));
    	list.remove(0);
    	if(!list.isEmpty())
    		sb.append(", ");
    }
    sb.append(">");
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    
  }
}
