import java.util.*;

public class ReverseArray {
public static void reverse(int a[],int n) {
	for(int i=0;i<=(n-1)/2;i++) {
		int swap=a[i];
		a[i]=a[n-1-i];
		a[n-1-i]=swap;			
	}
	System.out.println("reversed array");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter nummber of terms");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		reverse(a,n);
	
	}

}
