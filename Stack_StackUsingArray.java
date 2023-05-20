
import java.util.Scanner;

public class Stack_StackUsingArray {
	static int A[]=new int[20];
	static int sp=-1;
	static int max=19;
	public static void push() {
		if(sp==max) {
			System.out.println("Stack OverFlow");
			return;
		}
		Scanner sc=new Scanner(System.in);
		int data;
		System.out.println("Enter data:");
		data=sc.nextInt();
		sp++;
		A[sp]=data;
		sc.close();
	}
	public static void pop() {
		if(sp==-1) {
			System.out.println("Stack UnderFlow");
			return;
		}
		System.out.println("Poped item is : " +A[sp]);
		sp--;
	}
	public static void peek() {
		if(sp==-1) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Element At top is :"+A[sp]);
	}
	public static void display() {
		System.out.println("Array Looks like:");
		for(int i=0;i<=sp;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n!=5) {
			System.out.println("Press 1 for Push. \n Press 2 for Pop. \\n Press3 for Peek. \\n Press 4 for display. \\n Press5 for exit");
			n=sc.nextInt();
			switch(n) {
			case(1):push();
			break;
			case(2):pop();
			break;
			case(3):peek();
			break;
			case(4):display();
			break;
			case(5):break;
			}
			sc.close();
		}
		
	}

}
