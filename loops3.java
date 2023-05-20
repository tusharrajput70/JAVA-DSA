import java.util.*;

public class loops3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of term");
		int n=sc.nextInt();
		int sum=0;
		int sum2=0;
		sc.close();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			else {
				sum2=sum2+i;
			}
		}
		System.out.println("sum of even number till "+n+" is "+sum);
		System.out.println("sum of odd number till "+n+" is "+sum2);
		
	}

}
