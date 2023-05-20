import java.util.*;
public class Queue_StackUsingDEQUE {
	static class stack{
		Deque<Integer> d=new LinkedList<>();
		
		void push(int data) {
			d.addLast(data);
		}
		int pop() {
			if(d.isEmpty()) {
				return -1;
			}else {
				return d.removeLast();
			}
		}
		int peek() {
			if(d.isEmpty()) {
				return -1;
			}else {
				return d.peekLast();
			}
		}
		void print() {
			System.out.println(d);
		}
	}
	
	public static void main(String[] args) {
		stack s=new stack();
		s.push(2);
		s.push(3);
		s.print();
		s.pop();
		s.print();
	}
}
