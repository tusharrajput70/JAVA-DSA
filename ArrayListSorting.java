
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		///we can use same methods of sorting elements in ArrayList as of array
		//but here we discuss about the inbuilt function of sorting in ArrayList
		// function is collections.sort("listName"); used to sort arraylist in ascending order
		
		//collections is class while collection is interface
		ArrayList<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(4);
		l.add(1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		//descending order
		Collections.sort(l,Collections.reverseOrder());
		//here reverseOrder is a comparator-fnx logic
		System.out.println(l);
	}

}
