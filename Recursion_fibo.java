
import java.util.Scanner;

public class Recursion_fibo {
	public static int fibo(int n) {
	if(n==0||n==1) {
			return n;
	}
	else {
	return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i)+" ");
		}
	}

}
