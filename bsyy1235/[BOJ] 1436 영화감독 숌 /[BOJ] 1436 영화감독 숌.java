import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		int start = 666;
		
		while(flag!=n) {
			String number = Integer.toString(start);
			if(number.indexOf("666")!=-1) {
				flag++;
			}
			start++;
		}
		int end= start-1;
		System.out.println(end);			
		sc.close();
	}

}
