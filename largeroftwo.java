import java.util.Scanner;

public class largeroftwo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two number");
		float a= sc.nextFloat();
		float b= sc.nextFloat();
		sc.close();
		if(a>b) {
			System.out.println("Greater is "+a);
		}
		else {
			System.out.println("Greater is "+b);
		}
		
	}

}
