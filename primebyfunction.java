import java.util.*;

public class primebyfunction {
	public static boolean isprime(int n) {
		boolean isprime=true;
		for(int i=2;i<=n-1;i++) {
			if(n%2==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("is number is prime?\n"+isprime(n));
		
	}

}
