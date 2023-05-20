
public class BackTrackingOnARRAY {
	public static void backtrack(int A[],int index,int value) {
		//base condition
		if(index==A.length) {
			
			System.out.println("Base output");
			print(A);
			System.out.println();
			return;
		}
		//recursion
		A[index]=value;
		backtrack(A,index+1,value+1);
		//main backtrack
		A[index]-=2;
	}
	public static void print(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		int A[]=new int[5];
		backtrack(A,0,1);
		System.out.println("Backtracked Array:");
		print(A);
	}

}
