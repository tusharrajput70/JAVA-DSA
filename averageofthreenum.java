import java.util.Scanner;

public class averageofthreenum {

	public static void main(String[] args) {
		System.out.print("enter three number");
		Scanner sc= new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float average=(a+b+c)/3;
		System.out.print("average ="+average);
		sc.close();
	}

}
