
public class ArrayAsmt_repeatationOfElement {
	public static boolean repeat(int A[]){
		int n=A.length;
		int ctr=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(A[i]==A[j]) {
					ctr++;
				}
			}
		}
		if(ctr>n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int A[]= {1,2,3};
			System.out.println(repeat(A));
	}

}
