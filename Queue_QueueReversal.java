import java.util.*;

public class Queue_QueueReversal {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Stack<Integer> s=new Stack<>();
		for(int i=1;i<=5;i++) {
			q.add(i);
		}
		System.out.println(q);
		while(!q.isEmpty()) {
			s.add(q.remove());
		}
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		System.out.println(q);
	}

}
