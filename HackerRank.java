import java.util.*;
public class HackerRank {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String S=sc.nextLine();
	        int N=S.length();
			sc.close();
	        for(int i=0;i<N;i++){
	            if(i%2==0){
	                System.out.print(S.charAt(i));
	            }
	        }
	        System.out.print(" ");
	        for(int i=0;i<N;i++){
	            if(i%2!=0){
	                System.out.print(S.charAt(i));
	            }
	        }
	}

}
