
import java.util.Scanner;

public class BIT_MANIPULATION_iTH_BIT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println("enter index");
		int i=sc.nextInt();
		if((n&(1<<i))==0) {
			System.out.println(0+" is present at index "+i);
		}
		else {
			System.out.println(1+" is present at index "+i);
		}
		sc.close();
	}

}
