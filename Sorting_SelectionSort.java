
public class Sorting_SelectionSort {
	public static void sort(int A[]) {
		int n=A.length;
		for(int i=0;i<n-1;i++) {
			int minpos=i;
			for(int j=i+1;j<n;j++) {
				if(A[minpos]>A[j]) {
					minpos=j;
				}
			}
			int temp=A[minpos];
			A[minpos]=A[i];
			A[i]=temp;
		}
		for(int z=0;z<n;z++) {
			System.out.print(A[z]+"\t");
		}
	}
	public static void main(String[] args) {
		int A[]= {7,4,9,5,6,2};
		sort(A);
	}

}
