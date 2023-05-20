import java.util.*;
public class BackTrackKeyboardCombination {
	final static char keyboard[][]= {
			{},
			{'a','b','c'},
			{'d','e','f'},
			{'g','h','i'},
			{'j','k','l'},
			{'m','n','o'},
			{'p','q','r'},
			{'s','t','u'},
			{'w','x','y','z'}
			};
	public static void combination(int n) {
		int k=n;
		int i=0;
		int s[]=new int[n];
		while(k!=0) {
			s[i]=k%10;
			i++;
			k=k/10;
		}
		for(int j=0;j<i;j++) {
			System.out.println(s[j]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		combination(n);
		sc.close();
		
	}

}
