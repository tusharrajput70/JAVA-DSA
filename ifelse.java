import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter your age:");
		float a=sc.nextFloat();
		if(a>=18) {
			System.out.println("you are an adult");
		}
		else {
			System.out.println("you are not an adult");
		}
		sc.close();
		

	}

}
