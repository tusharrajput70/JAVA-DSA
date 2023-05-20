
public class Pattern12 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			for(int j=1;j<7-i;j++) {
				System.out.print(j+" ");
			}
			for(int j=1;j<2*i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=5-i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
