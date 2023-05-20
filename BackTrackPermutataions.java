
public class BackTrackPermutataions {
	public static void Permutations(String str,String ans) {
		if(str=="") {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			//picking current character
			char curr=str.charAt(i);
			//removing that current character from string
			String Newstr=str.substring(0,i)+str.substring(i+1,str.length());
			Permutations(Newstr,ans+curr);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		String str="abc";
		String ans="";
		Permutations(str,ans);
				
	}

}
