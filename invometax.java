import java.util.Scanner;

public class invometax {

	public static void main(String[] args) {
		int tax=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter your income");
		int n=sc.nextInt();
		 
		sc.close();
			if((n<=500000)&&(n>0)) {
				tax=0;
			}
			else if((n<=500000)&&(n<=1000000)){
				tax=(int)(0.2*n);
			}
			else if(n>1000000) {
				tax=(int)(30*n)/100;
			}
			System.out.print("tax to be paid is Rs."+tax);
	}

}
