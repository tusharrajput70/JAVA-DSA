
import java.util.Scanner;

public class BinarySearch {
	public static int search(int A[],int key) {
		int start=0,end=A.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(A[mid]==key) {
				return mid;
			}
			else if(A[mid]<key) {
				start=mid+1;
			}
			else if(A[mid]>key){
				end=mid-1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("enter number to search");
		int key=sc.nextInt();
		System.out.println("number found at index :"+search(A,key));
		sc.close();
		}
}
