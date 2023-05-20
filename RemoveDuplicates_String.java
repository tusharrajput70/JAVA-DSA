import java.util.*;
public class RemoveDuplicates_String {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("");
		System.out.println("Enter string:");                        //bhang bhosda
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			int ctr=0;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					ctr++;
				}
			}
			if(ctr==0) {
				sb.append(s.charAt(i));
			}
		}
	System.out.println("Compressed String is:\n"+sb);
	sc.close();
	}

}
