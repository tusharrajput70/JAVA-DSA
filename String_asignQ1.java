import java.util.*;

public class String_asignQ1 {
	public static int vovels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String s=sc.nextLine();
		System.out.println("number of lower case vovles in string is: "+vovels(s));
		sc.close();
	}

}
