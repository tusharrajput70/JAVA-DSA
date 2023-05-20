
public class Array_kadanesSum {
	public static void kadanes(int A[]) {
		int cs=0;
		int ms=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			cs=cs+A[i];
			if(cs<0) {
				cs=0;
			}
			ms=Math.max(cs,ms);
			
		}
		System.out.println(ms);
	}
	public static void main(String[] args) {
		int A[]= {-2,-3,4,-1,-2,1,5,-3};
		kadanes(A);

	}

}
