import java.util.*;
public class Stack_MaximumAreaOfReactangleInHistrogram {

	public static int MaxArea(int arr[]) {//O(n)
		int nsl[]=new int[arr.length];
		int nsr[]=new int[arr.length];
		int maxArea=Integer.MIN_VALUE;
		//next smaller right
		Stack<Integer> s=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
				}
			if(s.isEmpty()) {
				nsr[i]=arr.length;
			}
			else {
				nsr[i]=s.peek();
			}
			s.push(i);
		}
		//next small left
		s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
				}
			if(s.isEmpty()) {
				nsl[i]=-1;
			}
			else {
				nsl[i]=s.peek();
			}
			s.push(i);
		}
		//curr area
		//width =j-i-1=nsr[i]-nsl[i]-1
		for(int i=0;i<arr.length;i++) {
			int height=arr[i];
			int width=nsr[i]-nsl[i]-1;
			int currArea=height*width;
			maxArea=Integer.max(maxArea, currArea);
		}
		return maxArea;
	}
	public static void main(String[] args) {
		int A[]= {2,1,5,6,2,3};
		System.out.println( MaxArea(A)+ " maximum area of rectangle");
	}
}