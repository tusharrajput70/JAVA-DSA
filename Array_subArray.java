import java.util.Scanner;

public class Array_subArray {
	public static void subarray(int A[]) {
		int k=A.length;
		for(int i=0;i<k;i++) {
			for(int j=i;j<k;j++) {
				for(int z=i;z<=j;z++) {
					System.out.print(A[z]+" ");
				}
				System.out.println();
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
		subarray(A);
		sc.close();
	}

}
