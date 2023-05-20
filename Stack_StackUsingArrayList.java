import java.util.ArrayList;
import java.util.Scanner;

public class Stack_StackUsingArrayList {
	private static class stack{
		static ArrayList<Integer> list=new ArrayList<>();
		public static boolean isempty() {
			return list.size()==0;
		}
		//push 
		public void push(int data) {
			list.add(data);
		}
		public int pop() {
			if(isempty()==true) {
				System.out.println("Stack is empty");
				return -1;
			}
			int data=list.get(list.size()-1);
			list.remove(list.size()-1);
			return data;
		}
		public int peek() {
			if(isempty()==true) {
				System.out.println("Stack is empty");
				return -1;
			}
			return list.get(list.size()-1);
		}
		public void display() {
			for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
		int n=0;
		while(n!=5) {
			System.out.println("Press 1 for Push. \nPress 2 for Pop. \nPress 3 for Peek. \nPress 4 for display. \nPress5 for exit");
			n=sc.nextInt();
			switch(n) {
			case(1):{
				System.out.println("Enter data:");
				int m=sc.nextInt();
				s.push(m);
				}
			break;
			case(2):System.out.println("Poped element is:"+s.pop());
			break;
			case(3):System.out.println("Element at top is:"+s.peek());
			break;
			case(4):{System.out.println("Stack looks like:");
				s.display();
			}
			break;
			case(5):break;
			}
			sc.close();
		}
	}

}
