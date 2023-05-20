
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPairSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum value");
		int target=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			l.add(i);
		} 
		System.out.println(l);
		int n=l.size();
		int lp=0;
		int rp=n-1;
		while(lp<rp) {
			if(l.get(lp)+l.get(rp)==target) {
				System.out.println("pair found at indexes"+(lp)+","+(rp)+" and is "+l.get(lp)+" + "+l.get(rp)+" = "+target);
				break;
			}
			else if(l.get(lp)+l.get(rp)>target) {
				rp--;
			}
			else if(l.get(lp)+l.get(rp)<target) {
				lp++;
			}
		}
		sc.close();
		
	}
}
