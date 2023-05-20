import java.util.*;
public class Merge {
	public static void Mergee(int A[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		Mergee(A,si,mid);
		Mergee(A,mid+1,ei);
		MergeSort(A,si,mid,ei);
	}
	public static void MergeSort(int A[],int si,int mid,int ei) {
		int i=si;
		int j=mid+1;
		int k=0;
		int temp[]=new int[ei-si+1];
		while(i<=mid&&j<=ei) {
			if(A[i]<A[j]) {
				temp[k++]=A[i++];
			}
			else {
				temp[k++]=A[j++];
			}
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
		int n=A.length;
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
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
		Mergee(A,0,n-1);
		print(A);
	}

}
