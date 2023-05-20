import java.util.*;

public class Stack_StackJavaCollectionFrameWork {

	public static void main(String[] args) {
		Stack <Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n!=5) {
			System.out.println("Press 1 for Push. \nPress 2 for Pop. \nPress 3 for Peek. \nPress 4 for display. \nPress 5 for exit");
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
				System.out.println("Stack looks like:"+s);
				
			}
			break;
			case(5):break;
			}
			sc.close();
		}
	
	}

}
