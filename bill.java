import java.util.Scanner;
public class bill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the cost of pencil");
		float a = sc.nextFloat();
		System.out.println("enter the cost of pen");
		float b = sc.nextFloat();
		System.out.println("enter the cost of eraser");
		float c = sc.nextFloat();
		float total=a+b+c;
		float payable=(total*0.18f)+total;
		System.out.println("payable amout is "+payable);
		sc.close();
	}

}
