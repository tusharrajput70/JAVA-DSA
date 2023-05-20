
/**
 * Greedy_MaxBalancedStringPartitions
 */
public class Greedy_MaxBalancedStringPartitions {

	public static void main(String[] args) {
		String str="LRLRLLRRLLLRRR";
		int Lcount=0;
		int Rcount=0;
		int count=0;
		StringBuilder s=new StringBuilder("");
		if(str.length()!=0) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='L') {
				s.append(str.charAt(i));
				Lcount++;
			}else {
				s.append(str.charAt(i));
				Rcount++;
			}
			if(Lcount==Rcount) {
				System.out.print(s+" ");
				count++;
				s=new StringBuilder("");
			}
			
		}
		}else {
			System.out.print("String is empty");
		}
		System.out.println();
		System.out.println("there are "+count+" partition");
	}
}
