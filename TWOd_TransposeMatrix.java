
import java.util.Scanner;
//function to find transpose of matrix
public class TWOd_TransposeMatrix {
	public static void transpose(int A[][]) {
		int m=A.length;
		int n=A[0].length;
		int C[][]=new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				C[j][i]=A[i][j];
			}
		}
		print(C);
	}
	//function to print matrix
	public static void print(int X[][]) {
		int row=X.length;
		int column=X[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(X[i][j]+" ");
			}
			System.out.println();
		}
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
		print(A);
		//main logic starts from here!!
		System.out.println("transpose of matrix: ");
		transpose(A);
		sc.close();
	}

}
