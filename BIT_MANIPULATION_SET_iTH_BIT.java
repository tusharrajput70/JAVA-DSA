
import java.util.Scanner;

public class BIT_MANIPULATION_SET_iTH_BIT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println("enter setting index");
		int i=sc.nextInt();
		sc.close();
		int m=(n|(1<<i));
		System.out.println("number after setting becomes "+m);
	}

}
