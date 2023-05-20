
import java.util.Scanner;
import java.util.Stack;

public class Queue_QueueUsing2stack2ndApproach {
	public static void enqueue(int num,Stack<Integer> s,Stack<Integer> t) {
		while(!s.isEmpty()) {
			t.add(s.pop());
		}
		s.add(num);
		while(!t.isEmpty()) {
			s.add(t.pop());
		}
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
				enqueue(num,s,t);
				break;
			case(2):
				System.out.println("Dequeued element is: "+s.pop());
				break;
			case(3):
				System.out.println("Element at top is: "+s.peek());
				break;
			case(5):break;
			}
			sc.close();
		}
	}

}
