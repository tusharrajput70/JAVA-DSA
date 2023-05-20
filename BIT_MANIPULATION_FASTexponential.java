
import java.util.Scanner;

public class BIT_MANIPULATION_FASTexponential {
	public static int fast(int a,int n) {
		int ans=1;
		while(n!=0) {
			if((n&1)==1) {
				ans*=a;
			}                                
			a*=a;                             //less complexity O(log n);
			n=n>>1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int a=sc.nextInt();
		System.out.println("enter power");
		int n=sc.nextInt();
		System.out.println("ans: "+fast(a,n));
		sc.close();
	}

}
