import java.util.*;

public class Stack_StackPushAtBottum {
	public static void pushAtBottum(Stack<Integer> s,int data) {
		if(s.size()==0) {
			s.push(data);
			return;
		}
		//work
		int poped=s.pop();
		pushAtBottum(s,data);
		s.push(poped);
	}
	public static String reverseString(String str) {
		Stack<Character> ss=new Stack<>();
		for(int i=0;i<str.length();i++) {
			ss.push(str.charAt(i));
		}
		StringBuilder result=new StringBuilder();
		while(!ss.isEmpty()) {
			result.append(ss.pop());
		}
		return result.toString();
	}		
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top= (int) s.pop();
		reverseStack(s);
		pushAtBottum(s,top);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		//pushAtbottum
		
		//s.push(1);
		//s.push(2);
		//s.push(3);
		//System.out.println(s);
		//System.out.println("Enter element to push at bottum");
		//int data=sc.nextInt();
		//pushAtBottum(s,data);
		//System.out.println(s);
		
		
		
		//reverse a string (amazon)
		//System.out.println(reverseString("tushar"));
		
		
		//reverse a stack
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		reverseStack(s);
		System.out.println(s);
		sc.close();
		
	}

}
