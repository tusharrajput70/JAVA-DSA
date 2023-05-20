import java.util.*;

public class Queue_StackUsing2Queues {
	public static void pop(Queue<Integer> q,Queue<Integer> r) {
		int k=0;
		while(!q.isEmpty()) {
			k=(int) q.remove();
			if(q.isEmpty()) {
				break;
			}
			r.add(k);
		}
		while(!r.isEmpty()) {
			q.add(r.remove());
		}
		System.out.println("Poped element is: "+k);
	}
	public static void peek(Queue<Integer> q,Queue<Integer> r) {
		int k=0;
		while(!q.isEmpty()) {
			k=(int) q.remove();
			r.add(k);
		}
		while(!r.isEmpty()) {
			q.add(r.remove());
		}
		System.out.println("element at top is: "+k);
	}
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Queue<Integer> r=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q);
		pop(q, r);
		
		System.out.println(q);
		peek(q,r);
	}

}
