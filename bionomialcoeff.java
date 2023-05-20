import java.util.*;

public class bionomialcoeff {
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		System.out.println("enter the value of r");
		int r=sc.nextInt();
		int nfact=fact(n);
		int rfact=fact(r);
		int nmrfact=fact(n-r);
		int bio=nfact/(rfact*nmrfact);
		System.out.println("binomial expansion ncr is:"+bio);
		sc.close();
		

	}

}
