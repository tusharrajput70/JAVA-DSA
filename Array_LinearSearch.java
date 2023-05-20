
import java.util.*;


public class Array_LinearSearch {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A[]=new int[20];
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("enter number to search");
		int a=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			if(a==A[i]) {
				System.out.println("number found at "+i+"th index or "+(i+1)+" position");
			}
			
		}
		
		}
		
		

	}


