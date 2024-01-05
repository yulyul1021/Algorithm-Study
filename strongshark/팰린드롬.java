import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int re[] = new int[100];
        int count = 0;
        
        while(true) {
        	int x = sc.nextInt();
        	if(x==0) break;
        	re[count++] = x;
        }
        
        for (int i=0;i<count;i++) {
            re(re[i]);
        }
        sc.close();
    }
    
    static void re(int x) {
    	String s = Integer.toString(x);
    	String reverse = new StringBuilder(s).reverse().toString();
    	if(s.equals(reverse)) {System.out.println("yes");}
    	else System.out.println("no");
    }
}
