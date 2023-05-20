
/**
 * LL_DeleteNafterM
 */
public class LL_DeleteNafterM {

	
	private static class node{
		int data;
		node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	 private static node head=null;
	 private static node tail=null;
	 public static node size=null;
	 
	 
	 
	 
	 
	 
	 
	 
	 
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
		
		private static int size() {
			node temp=head;
			int i=0;
			while(temp!=null) {
				i++;
				temp=temp.next;
			}
			return i;
		}
		
		
	public static void deleteAtIndex(int i) {
		node temp=head;
		int k=0;
		node prev=null;
		while(k!=i) {
			prev=temp;
			temp=temp.next;
			k++;
		}
		prev.next=temp.next;
		temp.next=null;
	}
	public static void deletenm(int n,int m) {
		
		int k=1;
		while(m*k<size()) {//to skip m indexes again and again
			for(int j=0;j<n;j++) {//to delete n node :as after deleting a node the index of preceding one become equal to before
				
				deleteAtIndex(m*k);
			}
			k++;
		}
	}
	public static void main(String[] args) {
	addlast(1);
	addlast(2);
	addlast(3);
	addlast(4);
	addlast(5);
	addlast(6);
	addlast(7);
	addlast(8);
	addlast(9);
	addlast(10);
	removefirst();
	removelast();
	addfront(2);
	print();
	deletenm(2, 3);
	print();
	}
}
