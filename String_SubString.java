import java.util.*;
public class String_SubString {
	public static void subString(String word,int si,int ei) {
		for(int i=si;i<ei;i++) {
			System.out.print(word.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word="tusharRajput";
		System.out.println("enter starting index:");
		int si=sc.nextInt();
		System.out.println("enter ending index:");
		int ei=sc.nextInt();
		subString(word,si,ei);
		System.out.println();
		System.out.println(word.substring(si,ei));
		sc.close();
	}

}
