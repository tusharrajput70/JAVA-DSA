import java.util.*;
public class Stack_ValidParentheses {
	public static boolean parentheses(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[') {
				s.push(str.charAt(i));
			}
			else {
			if(s.isEmpty()) {
				return false;
			}
			if(str.charAt(i)==')'&&s.peek()=='('||str.charAt(i)=='}'&&s.peek()=='{'||str.charAt(i)==']'&&s.peek()=='[') {
				s.pop();
				}
			else{
				return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		String str="[{(())}]";

		System.out.println(parentheses(str));
	}

}
