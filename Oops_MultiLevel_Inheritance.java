
public class Oops_MultiLevel_Inheritance {
	public static void main(String args[]) {
		dog kutta=new dog();
		kutta.eat();
		kutta.legs=4;
		System.out.println(kutta.legs+" paair hote hai!!");
		kutta.breaths();
		kutta.bread="kaala kutta hai.";
		System.out.println(kutta.bread);
	}
}
class Animals{
	String color;
	void eat() {
		System.out.println("khata hai");
	}
	void breaths() {
		System.out.println("saas leta hai!!");
	}
}
class mammal extends Animals{
	int legs;
	void hairs() {
		System.out.println("have hairs");
	}
}
class dog extends mammal{
	String bread;
	void eyes() {
		System.out.println("have eyes");
	}
}