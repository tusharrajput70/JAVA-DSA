
import java.util.ArrayList;

public class ArrayListSwapp {
	public static ArrayList<Integer> swap(ArrayList <Integer> l,int i,int j) {
		int temp=l.get(i);
		l.set(i,l.get(j));
		l.set(j, temp);
		return l;
	}
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(4);
		l.add(1);
		System.out.println(l);
		//swap two numbers;
		int idx1=1,idx2=3;
		System.out.println(swap(l,idx1,idx2));
	}

}
