
import java.util.Scanner;

public class BIT_MANIPULATION_RANGE_OF_BITS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		sc.close();
		int i=2;
		int j=4;
		int a=((~0)<<(j+1));
		int b=(1<<i)-1;
		int m=a|b;
		System.out.println(n&m);
	}

}
