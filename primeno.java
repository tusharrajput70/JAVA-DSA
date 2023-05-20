import java.util.*;

public class primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		int ctr=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				ctr++;
			}
		}
		if(ctr==2) {
			System.out.println("number "+n+" is prime");
		}
		else
			System.out.println(n+ " is not a prime number");

	}

}
