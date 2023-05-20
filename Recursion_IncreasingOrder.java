
import java.util.Scanner;

public class Recursion_IncreasingOrder {
	public static void increasing(int n) {
		
		if(n==1) {
			System.out.print(n+" ");
			return;
			
		}
		increasing(n-1);
		System.out.print(n+" ");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		sc.close();
		increasing(n);
	}

}
