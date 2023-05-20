import java.util.Scanner;


public class Stack_StackUsingLinkedList {
	static class node{
		int data;
		node next;
		private node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	static class stack {
		static node head=null;
		static node tail=null;
		public static boolean isempty() {
			return head==null;
		}
		public  void push(int data) {
			node newnode=new node(data);
			if(isempty()) {
				head=newnode;
				return;
			}
			newnode.next=head;
			head=newnode;
			
		}
		public  int pop() {
			if(isempty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int data=head.data;
			head=head.next;
			return data;
		}
		public  int peek() {
			if(isempty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return head.data;
		}
		public  void display() {
			node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
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
			case(4):{
				System.out.println("Stack looks like:");
				s.display();
			}
			break;
			case(5):break;
			}
			sc.close();
		}
	}
}
