import java.util.*;

public class Recursion_Decreasing {
	public static void decreasing(int n) {
		System.out.print(n+" ");
		if(n==1) {
			return;
		}
		decreasing(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		decreasing(n);
		sc.close();
	}

}
