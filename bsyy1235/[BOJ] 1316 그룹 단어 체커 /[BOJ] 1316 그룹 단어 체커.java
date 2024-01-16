import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=0;
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			char[] array = str.toCharArray();
			int flag=1;
			
			Stack<Character> stack = new Stack<>();
			
			
			for(int j=0;j<array.length;j++) {
				if(stack.empty()) {
					stack.push(array[j]);
					continue;
				}
				if(array[j]==stack.peek()) {
					stack.pop();
					stack.push(array[j]);
				}
				else
					stack.push(array[j]);
			}
			
			
			while(true) {
				if(stack.empty())
					break;
				char c = stack.pop();
				if(stack.search(c)==-1) {
					flag=1;

				}
				else {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				num++;
			}
			
			stack.clear();
			
			
		}
		
		
		System.out.println(num);
		

		
		sc.close();
	}

}
