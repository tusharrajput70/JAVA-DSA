import java.util.*;

public class TWOd_SpiralMatrix {
	public static void spiral(int A[][]) {
		int startrow=0;
		int startcol=0;
		int endrow=A.length-1;
		int endcol=A[0].length-1;
		while(startrow<=endrow&&startcol<=endcol) {
			for(int j=startcol;j<=endcol;j++) {
				System.out.print(A[startrow][j]+" ");
			}
			for(int i=startrow+1;i<=endrow;i++) {
				System.out.print(A[i][endcol]+" ");
			}
			for(int j=endcol-1;j>=startcol;j--) {
				if(startrow==endrow) {
					break;
				}
				System.out.print(A[endrow][j]+" ");
			}
			for(int i=endrow-1;i>=startrow+1;i--) {
				if(startcol==endcol) {
					break;
				}
				System.out.print(A[i][startcol]+" ");
			}
			startcol++;
			endrow--;
			startrow++;
			endcol--;
			
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
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("spiral print:");
		spiral(A);
		sc.close();
	}

}
