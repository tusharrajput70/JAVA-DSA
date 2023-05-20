import java.util.*;
public class Queue_QueueUsingDeque {
	static class queue{
		Deque<Integer> d=new LinkedList<>();
		
		void push(int data) {
			d.addLast(data);
		}
		int pop() {
			if(d.isEmpty()) {
				return -1;
			}else {
				return d.removeFirst();
			}
		}
		int peek() {
			if(d.isEmpty()) {
				return -1;
			}else {
				return d.peekFirst();
			}
		}
		void print() {
			System.out.println(d);
		}
	}
	
	public static void main(String[] args) {
		queue q=new queue();
		q.push(2);
		q.push(3);
		System.out.println(q.peek());
		q.print();
		q.pop();
		q.print();
	}
}
