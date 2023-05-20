import java.util.*;

public class factorial_function {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		System.out.print("factorial is: "+fact(n));
	}

}
