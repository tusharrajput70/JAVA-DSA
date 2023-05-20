
import java.util.Scanner;
//brute force search....
public class TWOd_search {
	public static boolean search(int A[][],int key) {
		int m=A.length;
		int n=A[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(A[i][j]==key) {
					System.out.println("number "+key+" found at position ("+(i)+","+(j)+")");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	//less complex "stair case search method"
	public static boolean staircase(int A[][],int key) {
		int row=0;
		int column=A[0].length-1;
		while(row<A.length&&column>=0) {
			if(A[row][column]==key) {
				System.out.println("found key at ("+row+","+column+")");
				return true;
			}
			else if(key>A[row][column]) {
				row++;
			}
			else if(key<A[row][column]) {
				column--;
			}
		}
		return false;
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
		System.out.println("enter number to search: ");
		int key=sc.nextInt();
		if(search(A,key)==false) {
			System.out.println("key not found!!");	
			}
		if(staircase(A,key)==false) {
		System.out.println("key not found!!");	
		}
		sc.close();
	}

}
