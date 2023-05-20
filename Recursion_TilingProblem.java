import java.util.*;
public class Recursion_TilingProblem {
	public static int ways(int n) {
		//base case
		if(n==0||n==1) {
			return 1;
		}
		
		//work
		//vertical choice
		int fnm1=ways(n-1);
		//horizontal choice
		int fnm2=ways(n-2);
		//return statement 
		return fnm1+fnm2;  //total ways
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("No. of ways are:"+ways(n));
		
	}

}
