
import java.util.Scanner;

public class TWOd_DiagonalSum {
	public static void diagonalsum(int A[][]) {
		int n=A[0].length;
		int sum=0;
		for(int i=0;i<n;i++) {			
				for(int j=0;j<n;j++) {
					if(j==i) {
						sum+=A[i][j];
					}
					else if(i+j==n-1) {
						sum+=A[i][j];
					}
				}
		}
		System.out.println("daigonal sum:"+sum);
	}
	public static void lesscomplex(int A[][]) {
		int n=A[0].length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=A[i][i];
			if(i!=n-1-i) {
				sum+=A[i][n-i-1];
			}
		}
		System.out.println("diagonal sum by less complex:"+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int m=sc.nextInt();
		System.out.println("enter number of columns:");
		int n=sc.nextInt();
		int A[][]=new int[m][n];
		System.out.println("enter matrix");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("your matrix looks like");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		if(n==m) {
		diagonalsum(A);
		lesscomplex(A);
		}
		else {
			System.out.println("sum not possible");
		}
		sc.close();
}
}
