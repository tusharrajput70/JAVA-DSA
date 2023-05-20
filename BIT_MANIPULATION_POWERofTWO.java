
import java.util.Scanner;

public class BIT_MANIPULATION_POWERofTWO {
	public static boolean powerOFtwo(int n) {
		if((n&(n-1))==0) {
			return true;
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		if(powerOFtwo(n)==true) {
			System.out.println("Power Of Two");
		}
		else {
			System.out.println("Not Power Of Two");
		}
		sc.close();
	}

}
