
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPairSumOfRotatedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum value");
		int target=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<>();
		l.add(11);
		l.add(15);
		l.add(6);
		l.add(8);
		l.add(9);
		l.add(10);
		int rp=0;
		int lp=0;
		int n=l.size();
		for(int i=0;i<n;i++) {
			if(l.get(i+1)<l.get(i)) {
				 rp=i;
				 lp=i+1;
				break;
			}
		}
		while(lp!=rp) {
			if(l.get(rp)+l.get(lp)==target) {
				System.out.println("pair found at indexes"+(lp)+","+(rp)+" and is "+l.get(lp)+" + "+l.get(rp)+" = "+target);
				break;
			}
			else if(l.get(rp)+l.get(lp)<target) {
				lp=(lp+1)%n;
			}
			else if(l.get(rp)+l.get(lp)>target) {
				rp=(n+rp-1)%n;
			}
		}
		sc.close();
	}

}
