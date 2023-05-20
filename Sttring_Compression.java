import java.util.*;
public class Sttring_Compression {
	public static String compress(String c){
		StringBuilder sb=new StringBuilder("");
		
		for(int i=0;i<c.length();i++) {
			
			Integer count=1;
			while(i<c.length()-1&&c.charAt(i)==c.charAt(i+1)){
				count++;
				i++;
			}
			sb.append(c.charAt(i));
			if(count>1) {
				sb.append(count.toString());
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String c=sc.nextLine();
		System.out.println(compress(c));
		sc.close();
		

	}

}
