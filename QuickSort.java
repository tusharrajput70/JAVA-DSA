
import java.util.Scanner;

public class QuickSort {
	public static void Quick(int A[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int w=partition(A,si,ei);
		Quick(A,si,w-1);
		Quick(A,w+1,ei);
	}
	public static int partition(int A[],int si,int ei) {
		int pivort=A[ei];
		int i=si-1;
		for(int j=si;j<ei;j++) {
			if(A[j]<=pivort) {
				i++;
				int temp=A[j];
				A[j]=A[i];
				A[i]=temp;
			}
		}
		i++;
		int temp=A[ei];
		A[ei]=A[i];
		A[i]=temp;
		return i;
	}
	
	public static void print(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms :");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		Quick(A,0,n-1);
		System.out.println("Sorted Array");
		print(A);
	}

}
