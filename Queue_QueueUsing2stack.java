
import java.util.*;

public class Queue_QueueUsing2stack {
	public static void dequeue(Stack<Integer> s,Stack<Integer> t) {   	//1st approach
		
		if(s.isEmpty()) {
			System.out.println("Stack underflow");
			return;
		}
		while(!s.isEmpty()) {
			t.add(s.pop());
		}
		System.out.println("Dequeued element is"+t.pop());
		while(!t.isEmpty()) {
			s.add(t.pop());
		}
	}
	public static int peeek(Stack<Integer> s,Stack<Integer> t) {
		if(s.isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		while(!s.isEmpty()) {
			t.add(s.pop());
		}
		int k=(int) t.peek();
		while(!t.isEmpty()) {
			s.add(t.pop());
		}
		return k;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		Stack<Integer> t=new Stack<>();
		int n=0,num=0;
		while(n!=5) {
			System.out.println("Enter :1 for enqueue,2 for dequeue,3 for peek,4 for display,5 to exit");
			n=sc.nextInt();
			switch(n) {
			case(1):
				System.out.println("Enter data");
				num=sc.nextInt();
				s.add(num);
				break;
			case(2):
				dequeue(s,t);
				break;
			case(3):
				System.out.println("Element at top is: "+peeek(s,t));
				break;
			case(4):
				System.out.println(s);
				break;
			case(5):break;
			}
		}
		sc.close();
		//2nd approach is to reverse the arrangement while taking input
	}
}