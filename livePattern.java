import java.util.*;

public class livePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a=1;
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" "+a+" ");
			}
			a++;
			System.out.println();
		}

	}

}
