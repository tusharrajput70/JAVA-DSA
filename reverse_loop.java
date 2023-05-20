import java.util.*;

public class reverse_loop {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int s=0;
		int j=n;
		while(n!=0) {
			int k=n%10;
			s=s*10+k;
			n=n/10;
		}
		System.out.println(s+" reversed number");
	if(s==j) {
		System.out.println("number is also pallindrome");
	}
	else
		System.out.println("not pallindrome");
	}

}
