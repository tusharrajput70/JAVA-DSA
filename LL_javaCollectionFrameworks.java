// package LinkedList;
//functions in collection framework are always optimized
import java.util.LinkedList;

/**
 * LL_javaCollectionFrameworks
 */
public class LL_javaCollectionFrameworks {

	

	public static void main(String[] args) {
		//create object like-Integer,Float,Boolean.
		LinkedList<Integer> ll=new LinkedList<>();
		//add
		ll.addLast(1);
		ll.addLast(2);
		ll.addFirst(0);
		ll.isEmpty();
		//0->1->2
		//print
		System.out.println(ll);
		//remove
		ll.removeLast();
		ll.removeFirst();
		
		System.out.print(ll);
	}
}