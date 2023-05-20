
public class DandQ_MergeSort {
	public static void print(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void MergeSort(int A[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		MergeSort(A,si,mid);
		MergeSort(A,mid+1,ei);
		Merge(A,si,mid,ei);
	}
	public static void Merge(int A[],int si,int mid,int ei) {
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=ei) {
			if(A[i]<A[j]) {
				temp[k]=A[i];
				i++;
			}
			else {
				temp[k]=A[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			temp[k++]=A[i++];
		}
		while(j<=ei) {
			temp[k++]=A[j++];
		}
		for(k=0,i=si;k<temp.length;k++,i++) {
			A[i]=temp[k];
		}
	}
	public static void main(String[] args) {
		int A[]= {6,3,9,5,2,8};
		
		MergeSort(A,0,A.length-1);
		print(A); 
	}
	

}
