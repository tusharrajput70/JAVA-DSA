import java.util.*;
import java.lang.Math;

public class binarytodecimal {

	public static void main(String[] args) {
		System.out.println("Enter number in binary:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int deci=0;
		int i=0;
		while(n!=0){
			int k=n%10;
			deci=deci + (int)(k*Math.pow(2, i));
			n=n/10;
			i++;
		}

		System.out.print("number in binary: "+deci);
	}

}
