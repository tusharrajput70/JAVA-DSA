import java.util.*;

public class Array_pairs {
	public static void pairs(int A[]) {
		int k=A.length;
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				System.out.print("("+A[i]+","+A[j]+")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		System.out.println("enter array");
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		pairs(A);
		sc.close();
	}

}
