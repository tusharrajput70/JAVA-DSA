import java.util.*;

public class Queue_DEQUEdoubleEndedQueue {

	public static void main(String[] args) {
		Deque<Integer> d=new LinkedList<>();
		d.addFirst(1);
		d.addFirst(2);
		d.addLast(0);
		System.out.println(d);
		d.removeLast();
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
	}

}
