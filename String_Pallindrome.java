import java.util.*;
import java.lang.String;

public class String_Pallindrome {
	public static boolean pallindrome(String word) {
		int n=word.length();
		for(int i=0;i<(n)/2;i++) {
			if(word.charAt(i)!=word.charAt(n-1-i)) {
			return false;	
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String word=sc.next();
		if(pallindrome(word)==true) {
		System.out.println("string is pallindrome");	
		}
		else if(pallindrome(word)==false)
			System.out.println("string is not pallindrome");
		sc.close();
	}
	
	

}
