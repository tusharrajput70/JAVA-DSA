import java.util.*;

public class InvertedANDrotatedPyramin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows and column");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
