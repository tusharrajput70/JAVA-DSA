import java.util.Scanner;

public class postive_neg {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		if(n>=0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
	}

}
