
import java.util.Scanner;

public class BIT_MANIPULATION_CLEAR_iTH_BIT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println("enter index");
		int i=sc.nextInt();
		int m=(n&(~(1<<i)));
		System.out.println("cleared number is: "+m);
		sc.close();
	}

}
