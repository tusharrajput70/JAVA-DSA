import java.util.*;

public class Queue_ReversingTheFirstKele {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
		Stack<Integer> s=new Stack<>();
		for(int i=1;i<=10;i++) {
			q.add(i*10);
		}
		System.out.println(q);
		int k=5;
		for(int i=1;i<=k;i++) {
			s.add(q.remove());
		}
		while(!s.isEmpty()) {
			q2.add(s.pop());
		}
		while(!q.isEmpty()) {
			q2.add(q.remove());
		}
		System.out.println(q2);
	}

}
