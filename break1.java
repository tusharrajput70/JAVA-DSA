import java.util.Scanner;

public class break1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter number");
			int n=sc.nextInt();
			if(n%10==0) {
				break;
			}
			System.out.println( n);
		}while(true);
		sc.close();
	}

}
