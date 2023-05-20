
import java.util.Scanner;

public class Recursion_Friendspairing {
	public static int Ways(int n) {
		if(n==1||n==2) {
			return n;
		}
		int fnm1=Ways(n-1);
		int fnm2=Ways(n-2);
		int pairways=fnm2*(n-1);
		int totways=fnm1+pairways;
		return totways;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n=sc.nextInt();
		System.out.println("No. of ways are:"+Ways(n));
		sc.close();
	}

}
