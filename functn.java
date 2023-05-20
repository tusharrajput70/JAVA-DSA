import java.util.*;

public class functn {
	public static int sum() {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		return (a+b);
	}
	
	
	public static void main(String[] args) {
		System.out.print("sum is: "+sum());
	
	}

}
