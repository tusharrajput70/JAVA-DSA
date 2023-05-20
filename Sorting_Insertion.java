

public class Sorting_Insertion {
	public static void insertionSort(int A[]) {
		int n=A.length;
		for(int i=1;i<n;i++) {
			int curr=A[i];
			int prev=i-1;
			while(prev>=0&&A[prev]>curr) {
				A[prev+1]=A[prev];
				prev--; 
			}
			A[prev+1]=curr;
		}
	}
	public static void main(String[] args) {
		int A[]= {5,4,1,3,2};
		//insertionSort(A);
		int n=A.length;
		insertionSort(A);
		
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+"\t");
		}

	}

}
