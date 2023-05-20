
/**
 * LL_MergingofTwoLL
 */
public class LL_MergingofTwoLL {

	
	private static class node{
		int data;
		node next;
		private node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static node head=null;
	public static node tail=null;
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
	 public static node findMpoint(node head1,node head2) {
		 node temp=null;
		 while(head1!=null) {
			 temp=head2;
			 while(temp!=null) {
				 if(temp==head1) {
					 return head1;
				 }
				 temp=temp.next;
			 }
			 head1=head1.next;
		 }
		 return null;
	 }
	public static void main(String[] args) {
		
		
		node head1, head2;
		head1 = new node(10);
		head2 = new node(3);
		node newNode = new node(6);
		head2.next = newNode;
		newNode = new node(9);
		head2.next.next = newNode;
		newNode = new node(15);
		head1.next = newNode;
		head2.next.next.next = newNode;
		newNode = new node(30);
		head1.next.next = newNode;
		head1.next.next.next = null;
		node point=findMpoint(head1,head2);
		print();
		addlast(0);
		System.out.println("value at Megring node is:"+point.data);
	}

}
