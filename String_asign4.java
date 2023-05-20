import java.util.*;

public class String_asign4 {
	private static boolean anagrams(String s1, String s2) {
		
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
				}
			}
			if(count!=1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word 1: ");
		String s1=sc.next();
		System.out.println("enter word 2: ");
		String s2=sc.next();
		if(anagrams(s1,s2)==true) {
		System.out.println("words are anagrams");	
		}
		else if(anagrams(s1,s2)==false){
			System.out.println("words are NOT anagrams");
		}
		sc.close();
	}

	

}
