
import java.util.Scanner;

public class Recursison_Occurance {
	public static void Occurance(int A[],int key,int i) {
		if(i==A.length) {
			return;
		}
		if(A[i]==key) {
			System.out.print(" "+i); 
		}	
			Occurance(A,key,i+1);
	}
	public static void allOccurences(int arr[],int key,int i) {
	if(i==arr.length) {
	return;
		}
	if(arr[i] ==key) {
	System.out.print(i+" ");
		}
	allOccurences(arr,key,i+1);
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
		System.out.println("Enter key:");
		int key=sc.nextInt();
		allOccurences(A,key,0);
		Occurance(A,key,0);
		sc.close();
	}

}
