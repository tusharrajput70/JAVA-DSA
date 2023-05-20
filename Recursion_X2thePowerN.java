import java.util.*;

public class Recursion_X2thePowerN {
	public static int POW(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*POW(x,n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of X:");
		int x=sc.nextInt();
		System.out.println("Enter value of X:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Ans:"+POW(x,n));
	}

}
