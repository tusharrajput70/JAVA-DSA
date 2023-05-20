import java.util.*;
import java.lang.Math;

public class DECtoBIN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number in decimal form:");
		int n=sc.nextInt();
		int i=0;
		int bin=0;
		while(n!=0) {
			int rem=n%2;
			bin=bin+(int)(rem*Math.pow(10,i));
			n=n/2;
			i++;
			
		}
		System.out.print("number in binary: "+bin);
		sc.close();
		
	}

}
