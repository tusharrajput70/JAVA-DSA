import java.util.*;

public class Queue_QueueUsingJCF {
	
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();//here queue is not a class it is interface.....,,here we can also use ArrayDeque in place of LinkedList
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}

}
