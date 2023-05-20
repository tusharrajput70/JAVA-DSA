import java.util.*;


public class sumOfdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		int a=0;
		int sum=0;
		while(n!=0) {
			a=n%10;
			sum+=a;
			n=n/10;
		}
		System.out.println("sum is:"+sum);

	}

}
