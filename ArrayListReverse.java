import java.util.ArrayList;
public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList <Integer> l=new ArrayList<>();
		int k=1;
		for(int i=0;i<5;i++) {
			l.add(k);
			k++;
		}
		int n=l.size();
		for(int i=n-1;i>=0;i--) {
			System.out.print(l.get(i)+" ");
		}
	}

}
