
import java.util.Scanner;

public class Array_sub {
	
	public static void subarray(int A[]) {
		
		//BRUTE FORCE METHOD
		int k=A.length;
		
		int currentsum=0;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++) {
			for(int j=i;j<k;j++) { 
				currentsum=0;
				for(int z=i;z<=j;z++) {
					System.out.print(A[z]+" ");
				currentsum += A[z];
				}
				System.out.println("   sum:"+currentsum);
				if(currentsum>max) {
					max=currentsum;
				}
				
			}
		}
		System.out.println("maximum sum value:"+max);
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
		sc.close();
		subarray(A);
	}

}
