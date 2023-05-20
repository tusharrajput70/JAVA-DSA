
import java.util.ArrayList;

public class ArrayListMAx {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(4);
		l.add(3);
		for(int i=0;i<l.size();i++) {
			if(l.get(i)>max) {
				max=l.get(i);
			}
		}
		System.out.println("Maximum value is:"+max);
	
	
		
	}

}
