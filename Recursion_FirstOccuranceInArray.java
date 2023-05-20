
import java.util.Scanner;

public class Recursion_FirstOccuranceInArray {
	public static void Occurance(int A[],int key,int i) {
		if(i==A.length) {
			System.out.println("Sorry,Key not Found!");
			return;
		}
		if(A[i]!=key) {
			Occurance(A,key,i+1); 
		}
		else {
			System.out.println("first Occurance is at Index:"+i);
			return;
		}
		
	}
	public static void LastOccurance(int A[],int key,int i) {
		if(i==0-1) {
			System.out.println("Sorry,Key not Found!");
			return;
		}
		if(A[i]!=key) {
			LastOccurance(A,key,i-1); 
		}
		else {
			System.out.println("Last Occurance is at Index:"+i);
			return;
		}
		
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
		sc.close();
		Occurance(A,key,0);
		LastOccurance(A,key,n-1);
	}
}
