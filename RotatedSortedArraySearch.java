
public class RotatedSortedArraySearch {
	public static int search(int A[],int target,int si,int ei) {
		if(si>ei) {
			return -1;
		}
		int mid=(si+ei)/2;
		if(A[mid]==target) {
			return mid;
		}
		
		if(A[si]<=A[mid]) {
			if((target<=A[mid])&&(target>=A[si])) {
				return search(A,target,si,mid-1);
			}
			else {
				return search(A,target,mid+1,ei);
			}
		}
		else {
			if(A[mid]<=target && target<=A[ei]) {
				return search(A,target,mid+1,ei);
			}
			else {
				return search(A,target,si,mid-1);
			}
		}
		
		
	}
	public static void main(String[] args) {
		int A[]= {4,5,6,7,0,1,2,3};
		int target=0;
		System.out.println(search(A,target,0,A.length-1));
	}

}
