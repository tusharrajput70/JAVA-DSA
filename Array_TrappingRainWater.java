
public class Array_TrappingRainWater {
	public static int trappedrainwater(int A[]) {
		int n=A.length;
		//maximum left value
		int leftmax[]=new int[n];
		leftmax[0]=A[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(A[i],leftmax[i-1]);
		}
		//maximum right value
		int rightmax[]=new int[n];
		rightmax[n-1]=A[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(A[i],rightmax[i+1]);
		}
		
		//loop
		int trappedwater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(rightmax[i], leftmax[i]);
			trappedwater+=waterlevel-A[i];
		}
		return trappedwater;
	}
	public static void main(String[] args) {
	int A[]= {4,2,0,6,3,2,5};
	System.out.println("trapped rain water: "+trappedrainwater(A));
	}

}
