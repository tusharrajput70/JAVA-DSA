import java.util.*;

public class fever {

	public static void main(String[] args) {
		System.out.println("enter temperature");
		Scanner sc= new Scanner(System.in);
		double temp=sc.nextDouble();
		sc.close();
		if(temp>=99) {
			System.out.println("you have fever");
		}
		else {
			System.out.println("you don't have fever");
		}
	}

}
