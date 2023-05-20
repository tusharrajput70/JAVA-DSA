
public class StringCharRemove {

	public static void main(String[] args) {
		String s="cloudtech";
		String str="";
		int n=s.length();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='c') {
				continue;
			}
			str=str+s.charAt(i);
		}
		System.out.println(str);
	}

}
