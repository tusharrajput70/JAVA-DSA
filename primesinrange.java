import java.util.*;
import java.lang.Math;

public class primesinrange {
	public static void isprime(int n) {
		int ctr=0;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				ctr++;
			}
		}
		
		
		if(ctr==0) {
			
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter starting number of range");
		int a=sc.nextInt();
		System.out.println("enter end number of range");
		int n=sc.nextInt();
		sc.close();
		System.out.println("prime numbers are:");
		for(int i=a;i<=n;i++) {
			isprime(i);
		}
	}

}
