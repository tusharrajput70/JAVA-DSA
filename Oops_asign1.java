import java.util.*;


public class Oops_asign1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number's Real Part");
		int a=sc.nextInt();
		System.out.println("Enter 1st Number's Imaginary Part");
		int a1=sc.nextInt();
		System.out.println("Enter 2nd Number's Real Part");
		int b=sc.nextInt();
		System.out.println("Enter 2nd Number's Imaginary Part");
		int b1=sc.nextInt();
		sc.close();
		Complex n=new Complex();
		n.sum(a, a1, b, b1);
		n.diff(a, a1, b, b1);
		n.prod(a, a1, b, b1);
	}

}
class Complex{
	void sum(int a,int a1,int b,int b1) {
		System.out.println("Sum of complex numbers :"+(a+b)+" + i"+(a1+b1));
	}
	void diff(int a,int a1,int b,int b1) {
		System.out.println("Difference of complex numbers :"+(a-b)+" + i"+(a1-b1));
	}
	void prod(int a,int a1,int b,int b1) {
		System.out.println("Product of complex numbers :"+(a*b)+" + i"+(a1*b1));
	}
}
