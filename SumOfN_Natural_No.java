import java.util.*;

public class SumOfN_Natural_No{

	public static void main(String[] args) {
		int i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n");
		int n=sc.nextInt();
		sc.close();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.print(sum);
		sc.close();
	}

}
