
public class Oops_MethodOverLoading {
	//also known as function overloading
	public static void main(String args[]) {
		calculator calc =new calculator();  // object creation
		System.out.println(calc.sum(2, 4));
		System.out.println(calc.sum(1.5f, 4.8f));
		System.out.println(calc.sum(1, 2, 3));
	}
}
class calculator{
	int sum(int a,int b) {
		return a+b;
	}
	float sum(float a,float b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	
}
