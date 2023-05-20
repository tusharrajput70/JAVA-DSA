
import java.util.Scanner;

public class BIT_MANIPULATION_COUNTsetBITS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			if((n&1)==1) {
				count++;
			}
			n=(n>>1);
		}
		System.out.println("contains "+count+" set bits");
		sc.close();
	}

}
