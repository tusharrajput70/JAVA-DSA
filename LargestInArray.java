import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]=new int[50];
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int min=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(min<A[i]) {
				min=A[i];
			}
		}
		sc.close();
		System.out.println("maximum is="+min);
	}

}
