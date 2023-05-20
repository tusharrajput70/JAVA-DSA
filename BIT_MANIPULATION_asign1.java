
import java.util.Scanner;

public class BIT_MANIPULATION_asign1 {
	public static double numberTOnumber(int n) {
		int ans=1;
		int a=n;
		while(n!=0) {
			if((n&1)==1) {
				ans*=a;
			}
			a*=a;
			n=n>>1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println(numberTOnumber(n));
		sc.close();
	}

}
