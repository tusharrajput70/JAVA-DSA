import java.util.*;


public class pallindrome {
	public static void pallindromeE(int n) {
		int p=n;
		int k=0;
		int sum=0;
		while(n!=0) {
			k=n%10;
			sum=sum*10+k;
			n=n/10;
		}
		if(sum==p) {
			System.out.println("number "+p+" is pallindrome");
		}
		else
			System.out.println("number "+p+" is not pallindrome");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		pallindromeE(n);
		

	}

}
