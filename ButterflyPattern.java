
public class ButterflyPattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int x=0;
		for(int i=4;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=x;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			x=x+2;
		}
	}

}
