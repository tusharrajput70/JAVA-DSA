
public class Oops_inheritance_byInterface {

	public static void main(String[] args) {
		beer b= new beer();
		b.eats();
		b.milk();
	}
}
interface herbivores{
	void eats();
}
interface carnivores{
	void milk();
}
class beer implements herbivores,carnivores{
	public void milk() {
		System.out.println("gives milk");
	}
	public void eats() {
		System.out.println("eats grass");
	}
}