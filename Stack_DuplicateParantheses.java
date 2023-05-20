import java.util.*;
public class Stack_DuplicateParantheses {
	public static boolean DuplicateParantheses(String str) {//O(n)
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==')') {
				int ctr=0;
					while(s.peek()!='(') {
						s.pop();
						ctr++;
				}
				if(ctr<1) {
					return true;
				}
			}
			else {
				s.push(str.charAt(i));
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str="(a+b)+(c+d)";
		System.out.println(DuplicateParantheses(str));
	}

}
