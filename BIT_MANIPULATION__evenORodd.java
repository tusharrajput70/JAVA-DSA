import java.util.*;

public class BIT_MANIPULATION__evenORodd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		if((a&1)==1) {
			System.out.println("number is odd");
		}
		else {
			System.out.println("number is even");
		}
		sc.close();
	}

}
