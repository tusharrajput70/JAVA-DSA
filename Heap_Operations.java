import java.util.*;

public class Heap_Operations {
	static class heap{
		ArrayList<Integer> arr=new ArrayList<>();
		
		public void add(int data) {
			
			//add atlast
			arr.add(data);
			int x=arr.size()-1;//index of last node
			int par= (x-1)/2;//parent of last node
			while(arr.get(x)<arr.get(par)) {		//for max heap condition get changed to arr.get(x)>arr.get(par)
				int temp=arr.get(x);
				arr.set(x, arr.get(par));
				arr.set(par, temp);
				x=par;	//changing the value of child
				par=(x-1)/2;	//again finding parent
			}
		}
		public void print() {
			System.out.println(arr);
		}
		public int peek() {
			return arr.get(0);
		}
		private void heapify(int i) {
			int minidx=i;
			int left=2*i+1;
			int right=2*i+2;
			if(left<arr.size()&&arr.get(left)<arr.get(minidx)) {		//for max heap arr.get(left)>arr.get(minidx)
				minidx=left;
			}
			if(right<arr.size()&&arr.get(right)<arr.get(minidx)) {		//for max heap arr.get(right)>arr.get(minidx)
				minidx=right;
			}
			if(minidx!=i) {
				//swap
				int temp=arr.get(i);
				arr.set(i, arr.get(minidx));
				arr.set(minidx,temp);

				//if heap is not fixed till now then we can call heapify for minidx node
				heapify(minidx);
			}
			
		}
		public int remove() {
			//step 1-swap the values of 1st and last index
			int data=arr.get(0);
			arr.set(0,arr.get(arr.size()-1));
			arr.set(arr.size()-1,data);
			
			//step 2-remove last
			arr.remove(arr.size()-1);
			
			//step 3-heapify
			heapify(0);
			return data;
		}
		public boolean isEmpty() {
			return arr.size()==0;
		}
	}
	public static void main(String[] args) {
		heap h=new heap();
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.print();
		while(!h.isEmpty()) {	//heap sort-O(nlogn)	//works as same as priority queue;
			System.out.print(h.peek()+" ");
			h.remove();
		}
	}

}
