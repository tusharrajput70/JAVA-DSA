
public class String_comparison {

	public static void main(String[] args) {
	String A[]= {"apple","mango","banana"};
	String largest=A[0];
	for(int i=0;i<A.length;i++) {
		int k=largest.compareTo(A[i]);
		if(k<0) {
		largest=A[i];
		}
	}
	System.out.println("maximum string is: "+largest);
	}

}
