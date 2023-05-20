import java.util.*;

public class Stack_NextGreaterInArrayUsingStack {
		//code is for next greater right 
	
		//for next greater left we'll be iterating loop from the front
		//for next smallest we'll change the condition in while loop
	public static void main(String[] args) {//O(n)
		int arr[]= {6,8,0,1,3};
		Stack <Integer> s=new Stack<>();
		int nxtgrt[]=new int[arr.length];
		//firstly we want to iterate from the back of array
		for(int i=arr.length-1;i>=0;i--) {
		//now we will pop elements from the stack until stack got empty or element at top is greater than curr element
			while(!s.isEmpty() && arr[i]>=arr[s.peek()]) {
				//here we are pushing index not array elements in stack 
				
				s.pop();
			}
			
		//now if stack got empty then assign value -1 else peek value of stack
			if(s.isEmpty()) {
				nxtgrt[i]=-1;
			}
			else {
				nxtgrt[i]=arr[s.peek()];
			}
			
			s.push(i);
		}
		
		
		//printing next greater array
		System.out.println("Next greater elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(nxtgrt[i]+" ");
		}
		
	}

}
