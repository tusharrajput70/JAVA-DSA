
import java.util.Scanner;

public class MergeSort {
	public static void MergeRecursion(int A[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		MergeRecursion(A,si,mid);
		MergeRecursion(A,mid+1,ei);
		MergeArray(A,si,mid,ei);
	}
	public static void MergeArray(int A[],int si,int mid,int ei) {
		int i=si;
		int j=mid+1;
		int k=0;
		int temp[]=new int[ei-si+1];
		while(i<=mid&&j<=ei) {
			if(A[i]<A[j]) {
				temp[k]=A[i];
				i++;
			}
			else {
				temp[k]=A[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			temp[k++]=A[i++];
		}
		while(j<=ei) {
			temp[k++]=A[j++];
		}
		for(k=0,i=si;k<temp.length;k++,i++) {
			A[i]=temp[k];
		}
	}
	public static void print(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		MergeRecursion(A,0,A.length-1);
		System.out.println("Sorted Array:");
		print(A);
	}
}
