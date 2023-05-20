import java.util.*;

public class Queue_FirstNonRepeatingLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Character> q=new LinkedList<>();
		System.out.println("Enter string");
		String str="aabccxb";
		int freq[]=new int[26];
		for(int i=0;i<26;i++) {
			freq[i]=0;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			q.add(ch);
			freq[ ch - 'a']++;
			while(!q.isEmpty()&&(freq[q.peek()-'a']>1)) {
				q.remove();
			}
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			}else {
				System.out.print(q.peek()+" ");
			}
		}
		sc.close();
		
	}

}
