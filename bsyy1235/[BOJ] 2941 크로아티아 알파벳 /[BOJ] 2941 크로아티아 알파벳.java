import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		int num=0;
		
		
		for(int i = 0 ; i<len;i++) {
			char ch = str.charAt(i);
			if(ch=='c') {
				if(i<len-1) {
				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-')
					i++;
				}
			}
			else if(ch=='d') {
				if(i<len-1) {
					if(str.charAt(i+1)=='-')
						i++;
					else if(i<len-2){
						if(str.charAt(i+1)=='z' && str.charAt(i+2)=='=')
							i+=2;
					}
				}
			}
			else if(ch=='l' || ch=='n') {
				if(i<len-1) {
				if(str.charAt(i+1)=='j')
					i++;
				}
			}
			else if(ch=='s' || ch=='z') {
				if(i<len-1) {
					if(str.charAt(i+1)=='=')
						i++;
				}
			}
			num++;
		}
	
		System.out.println(num);
		
		sc.close();
	}

}
