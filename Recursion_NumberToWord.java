import java.lang.String;
import java.util.Scanner;

public class Recursion_NumberToWord {
	static String Digit[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	public static void Word(int number) {
		if(number==0) {
			return;
		}
		int lastdigit=number%10;
		Word(number/10);
		System.out.print(Digit[lastdigit]+" ");
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();
	sc.close();
	Word(n);
	}

}
