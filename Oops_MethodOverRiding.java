
public class Oops_MethodOverRiding {
	public static void main(String args[]) {
		deer brown=new deer();      //object creation
		brown.eat();
	}
}
class LivingBeing{
	void eat(){
		System.out.println("eats anything");
	}
}
class deer extends LivingBeing{
	void eat(){
		System.out.println("eats grass");
	}
}