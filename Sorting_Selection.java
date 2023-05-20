import java.util.*;

public class Sorting_Selection {
	public static void SelectionSort(int A[]) {
		int n=A.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(A[min]>A[j]) {
					min=j;
				}
			}
			int temp=A[min];
			A[min]=A[i];
			A[i]=temp;
		}
	}
	public static void print(int A[]) {
		int n=A.length;
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int A[]= new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		SelectionSort(A);
		print(A);
		sc.close();

	}

}
