
import java.util.Scanner;

public class Recursion_X2thePowerNoptimized {
	public static int POW(int x,int n) {
		if(n==0) {
			return 1;
		}
		int s=POW(x,n/2);
		int ss=s*s;
		
		if(n%2!=0) {
			return x*ss;
		}
		return ss;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of X:");
		int x=sc.nextInt();
		System.out.println("Enter Value Of X:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Ans:"+POW(x,n));
	}

}
