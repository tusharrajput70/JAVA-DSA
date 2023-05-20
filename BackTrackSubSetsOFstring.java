
public class BackTrackSubSetsOFstring {
	public static void Substring(String str,String ans,int i) {
		//base condition
		if(i==str.length()) {
			if(ans=="") {
				System.out.println("*(fy)");
			}
			else {
			System.out.println(ans);
			}
			return;
		}
		//yes
		Substring(str,ans+str.charAt(i),i+1);
		//no
		Substring(str,ans,i+1);
		
	}
	public static void main(String[] args) {
		String str="abc";
		String ans="";
		Substring(str,ans,0);
	}

}
