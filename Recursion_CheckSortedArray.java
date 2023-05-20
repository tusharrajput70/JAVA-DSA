
import java.util.Scanner;

public class Recursion_CheckSortedArray {
public static boolean IsSorted(int A[],int i) {
	if(i==A.length-1) {
		return true;
	}
	if(A[i]>A[i+1]) {
		return false;
	}
	return IsSorted(A,i+1);
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Terms:");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter Array:");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Is Array Is  Ascendingly Sorted?  Ans: "+IsSorted(A,0));

	}

}
