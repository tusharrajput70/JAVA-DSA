import java.util.*;

public class switchcalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int a=sc.nextInt(),b=sc.nextInt();
		sc.close();
		System.out.println("enter A for addition,S for substraction,M for multiplication and D for division");
		char operator=sc.next().charAt(0);
		switch(operator) {
		case 'A':System.out.println(a+b);
		break;
		case 'S':System.out.println(a-b);
		break;
		case 'M':System.out.println(a*b);
		break;
		case 'D':System.out.println(a/b);
		break;
		default:System.out.println("invalid operation");
		}
	}

}
