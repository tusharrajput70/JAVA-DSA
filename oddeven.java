import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int n= sc.nextInt();
		sc.close();
			if(n%2==0) {
				System.out.println("number is even");
			}
			else {
				System.out.println("number is odd");
			}
	}

}
