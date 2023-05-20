import java.util.*;

public class AverageOfThree {
	public static float avg(float a,float b,float c) {
		float avg=(a+b+c)/3;
		return avg;
	}

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.print("enter first number");
			float a=sc.nextFloat();
			System.out.print("enter second number");
			float b=sc.nextFloat();
			System.out.print("enter third number");
			float c=sc.nextFloat();
			
			System.out.print("average is:"+avg(a,b,c));
		}
		
		
		

	}

}
