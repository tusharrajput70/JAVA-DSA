
import java.util.Scanner; 


/**
 * LL_Basic
 */
public class LL_Basic{

	
	private static class node{
		int data;
		node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	 private static node head=null;
	 private static node tail=null;  //it is not mandatory to assign value as null if we don't write any thing to variable it automatically get null as its value;
	
	
	
	//add front
	 private static void addfront(int data) {//constant time complexity O(1); 
		//step1:create new node
		
		node newnode=new node(data);
				
		//base
		if(head==null) {
			head=tail=newnode;
			
			return;
		}
		
		newnode.next=head;//link
		head=newnode;
	}
	
	
	//add
	 private static void addlast(int data) {//constant time complexity O(1);  
		//step1. create new node
		node newnode=new node(data);
		
		//special case
		if(head==null) {
			head=tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	
	
	
	
	//print
	private static void print() {//O(n)
		node temp=head;
		if(head==null&&tail==null) {
			System.out.println("Linked List is empty");
		}
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next; 
		}
		System.out.println("null");
	}
	
	
	
	//add middle
	private static void addat(int i,int data) {//O(n) we have to find index 
		node newnode=new node(data);
		node temp=head;
		int k=0;
		if(i==0) {
			addfront(data);
			return;
		}
		while(temp!=null) {
			if(k==i-1) {
				break;
			}
			else {
				temp=temp.next;
				k++;
			}
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	private static int size() {
		node temp=head;
		int i=0;
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		return i;
	}
	private static int removefirst() {
		if(head==null) {
			System.out.println("linked list is empty");
			return Integer.MAX_VALUE;
		}
		else if(head==tail) {
			int val=head.data;
			head=tail=null;
			return val;
		}
		int val=head.data;
		head=head.next;
		return val;
	}
	
	//remove last
	private static int removelast() {
		node temp=head;
		
		if(tail==null) {
			System.out.println("Linked List is empty");
				return Integer.MAX_VALUE;
		}
		else if(head==tail) {
			int val=tail.data;
			head=tail=null;
			return val;
		}
		node prev=head;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		int val=tail.data;
		prev.next=null;
		tail=prev;
		return val;
	}
	private void search(int key) {
		node temp=head;
		int i=0;
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("key found at index "+i);
				return;
			}
			i++;
			temp=temp.next;
			
		}
		System.out.println("key not found");
		
	}
	private static int search(int key,int i,node temp) {
		if(temp.data==key) {
			return i;
		}
		else if(temp.next==null){
			return -1;
		}
		else {
		temp=temp.next;
		return search(key,i+1,temp);
		}
	}
	private static void reverse(node curr) {//O(n)
		node prev=null;
		node  next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	
	
	private static void Findremove(int n,int m){
		int i=0;
		node prev=head;
		if(m==n) {
			removefirst();
		}
		

		while(i<m-n-1) {
			prev=prev.next;
			i++;
			}
		prev.next=prev.next.next;
		
	}
	
	
	private static boolean pallindrome(int n) {
		for(int i=0;i<n/2;i++) {
			if(valueAt(i)!=valueAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	private static int valueAt(int i) {
		node temp=head;
		int k=0;
		while(k!=i) {
			temp=temp.next;
			k++;
		}
		return temp.data;
	}
	
	private static void iscycle() {
		node slow=head;
		node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) {
					System.out.println("Linked List is cyclic");
					return;
			}	
		}

		System.out.println("Linked List is not cyclic");
	}
	
	
	private static void CyclicToNonCyclic() {
		node slow=head;
		node fast=head;
		int ctr=0;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) {
					ctr++;
					System.out.println("Linked list is Cyclic");
					break;
			}	
		}
		if(ctr==0) {
			System.out.println("Linked list is not Cyclic");
			return;
		}
		slow=head;
		node end = null;
		while(slow!=fast) {
			end=fast;
			slow=slow.next;
			
			fast=fast.next;
		}
		end.next=null;
	}
	private static void addafter(int info,int data) {
		node temp=head;
		node newnode=new node(data);
		if(info==tail.data) {
			addlast(data);
			return;
		}
		while(temp.next!=null) {
			if(temp.data==info) {
				break;
			}
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	private static void addbefore(int info,int data) {
		node temp=head;
		node prev=null;
		node newnode=new node(data);
		if(info==head.data) {
			addfront(data);
			return;
		}
		
		while(temp.next!=null) {
			if(temp.data==info) {
				break;
			}
			prev=temp;
			temp=temp.next;
		}
		newnode.next=prev.next;
		prev.next=newnode;
	}
	
	
	
	
	
	//merge sort
	private node mergesort(node head) {
		//base
		if(head==null||head.next==null) {
			return head;///for one and no element in linked list
		}
		//work
		node mid=getmid();
		
		node righthead=mid.next;
		mid.next=null;
		node newleft=mergesort(head);
		node newright=mergesort(righthead);
		return merge(newleft,newright);
	}
	private static node getmid() {
		node slow=head;
		node fast=head.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	private static node merge(node head1,node head2) {
		node mergedll=new node(-1);
		node temp=mergedll;
		while(head1!=null&&head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				head1=head1.next;
			}
			else {
				temp.next=head2;
				head2=head2.next;
			}
			temp=temp.next;
		}
		while(head1!=null) {
			temp.next=head1;
			temp=temp.next;
			head1=head1.next;
		}
		while(head2!=null) {
			temp.next=head2;
			temp=temp.next;
			head2=head2.next;
		}
		return mergedll.next;
		
	}
	
	
	//node at index......................................................
	private static node nodeAt(int i) {
		node temp=head;
		int k=0;
		while(k!=i) {
			temp=temp.next;
			k++;
		}
		return temp;
	}
	
	
	
	
	
	
	private static void removeandadd(int i,int data) {
		node temp=new node(data);
		if(nodeAt(i)==head) {
			node n=nodeAt(i);
			node m=head.next;
			head=nodeAt(i);
			n.next=m;
		}
		
		node prev=nodeAt(i-1);
		node curr=nodeAt(i);
		temp.next=curr.next;
		prev.next=temp;
		
	}
	private static void llToArray(int A[]) {
		node temp=head;
		int k=0;
		while(temp!=null) {
			A[k]=valueAt(k);
			k++;
			temp=temp.next;
		}
	}
	
	private static void zigzagArray(int A[]) {
		int n=A.length;
		int B[]=new int[A.length];
		int mid=(n)/2;
		int i=0;
		int j=n-1;
		int k=0;
		while(i<=mid&&j>mid) {
			B[k]=A[i];
			k++;
			i++;
			B[k]=A[j];
			j--;
			k++;
		}
		while(i<=mid) {
			B[k]=A[i];
			k++;
			i++;
		}
		while(j>mid) {
			B[k]=A[j];
			j--;
			k++;
		}
		for(int o=0;o<n;o++) {
			A[o]=B[o];
		}
	}
	
	private static void ArrayToll(int A[]) {
		int n=A.length;
		head=tail=null;
		for(int i=0;i<n;i++) {
		addlast(A[i]);
		}
	}
	
	
	//zigzag........................................................................
	private static void Zigzag() {
		node slow=head;
		node fast=head.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		node mid=slow;
		//reverse 2nd half
		node curr=mid.next;

		mid.next=null;
		node prev=null;
		node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node left=head;
		node right=prev; 
		node nextL,nextR;
		while(left!=null&&right!=null) {
			nextL=left.next;
			left.next=right;
			nextR=right.next;
			right.next=nextL;
			
			left=nextL;
			right=nextR;
		}
	}
		
	
	public static void main(String[] args) {
		LL_Basic ll=new LL_Basic();
		// methods
		
		addfront(2);
		addfront(1);
		addlast(3);
		addlast(4);
		addat(1, 0);
		print();
		System.out.println("Size of Linked List is: "+size());
		removefirst();
		print();
		System.out.println((removelast()));
		
		ll.search(1);
		print();
		
		
		
		// recursive search..........................................................
		System.out.println("Key found at index:"+search(2, 0, head));

		print();
		Findremove(2,size());
		print();
		// ..........................................................................
		
		
		
		
		// checking Pallindrome ...............................................................
		addlast(1);
		addlast(3);
		addlast(1);
		print();
		System.out.println(pallindrome(size()));
		// ......................................................................................
		
		
		
		
		
		// cyclic non cyclic...........................................................................
		head=new node(1);
		node temp=new node(2);
		head.next=temp;
		head.next.next=new node(3);
		head.next.next.next=temp;
		CyclicToNonCyclic();
		print();
		// ............................................................................................
		
		
		
		
		
		// .............................................................................
		// insertion after a given info
		addlast(1);
		addlast(2);
		addlast(4);
		print();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter info after which element is to be added");
		int info=sc.nextInt();
		addafter(info,3);
		print();
		// .............................................................................
		
		
		
		
		// .............................................................................
		// insertion before a given node/info
		addlast(1);
		addlast(2);
		addlast(4);
		print();
		System.out.println("Enter data to be inserted");
		int d=sc.nextInt();
		System.out.println("Enter info before which element is to be added");
		int info2=sc.nextInt();
		addbefore(info2,d);
		print();
		// ............................................................................
		
		
		
		removeandadd(info2, d);
		
		// Merge Sort
		// ............................................................................
		
		addlast(4);
		addlast(3);
		addlast(2);
		addlast(1);
		print();
		head=ll.mergesort(head);
		print();
	
		
		
		// LinkedList to Array............................................................
		addlast(1);
		addlast(2);
		addlast(3);
		addlast(4);
		addlast(5);
		int A[]=new int[size()];
		llToArray(A);
		for(int i=0;i<size();i++) {
			System.out.print(A[i]+" ");
		}
		// .................................................................................
		
		// zigzag Linked List using Array...........................................................................
		zigzagArray(A);
		System.out.println();
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		// ArrayToll
		ArrayToll(A);
		System.out.println();
		print();
		//.................................................................................
		
		
		//Zigzag...........................................................................
		addlast(1);
		addlast(2);
		addlast(3);
		addlast(4);
		addlast(5);
		print();
		Zigzag();
		print();
		iscycle();
		reverse(temp);
		sc.close();
	}


	


	

}
