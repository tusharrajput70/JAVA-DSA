
public class Sorting_BubbleSort {
	public static void sort(int A[]) {
		int n=A.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(A[j+1]>A[j]) {
					int swap=A[j];
					A[j]=A[j+1];
					A[j+1]=swap;
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		int A[]= {9,4,5,3,7,8};
		sort(A);
		int n=A.length;
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+"\t");
		}
	}

}
