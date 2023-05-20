import java.util.*;

public class StringBuilder_UpperCaseConversion {
	public static String capital(String sentence) {
		StringBuilder sb=new StringBuilder("");
		char ch=Character.toUpperCase(sentence.charAt(0));
		sb.append(ch);
		for(int i=1;i<sentence.length();i++) {
			if(sentence.charAt(i)==' '&&i<sentence.length()-1) {
				sb.append(sentence.charAt(i));
				i++;
				sb.append(Character.toUpperCase(sentence.charAt(i)));
			}
			else {
			sb.append(sentence.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence=sc.nextLine();
		System.out.println(capital(sentence));
		sc.close();
	}
}
