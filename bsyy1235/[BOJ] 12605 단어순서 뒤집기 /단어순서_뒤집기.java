import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				stack.add(st.nextToken());
			}
			
			sb.append("Case #").append(i+1).append(": ");
			while(!stack.isEmpty()) {
				sb.append(stack.pop()).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}
