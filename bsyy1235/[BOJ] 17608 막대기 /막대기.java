import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++) {
			stack.add(Integer.parseInt(br.readLine()));
		}
		
		int num = 1;
		int a = stack.pop();
		while(!stack.isEmpty()) {
			int pop = stack.pop();
			if(a < pop) {
				num++;
				a=pop;
			}
		}

		bw.write(Integer.toString(num));
		bw.flush();
		bw.close();
		
	}
}
