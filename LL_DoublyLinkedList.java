
/**
 * LL_DoublyLinkedList
 */
public class LL_DoublyLinkedList {

	
	private static class node{
		node prev;
		int data;
		node next;
		private node(int data) {
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	public static node head=null;
	public static node tail=null;
	public static int size;
	
	//add....................................
	private void add(int data) {
		size++;
		node temp=new node(data);
		if(head==null) {
			head=tail=temp;
			return;
		}
		tail.next=temp;
		temp.prev=tail;
		tail=temp;
	}
	private void print() {
		node temp=head;
		System.out.print("null<->");
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	
	private  void addfront(int data) {
		
		size++;
		node temp=new node(data);
		if(head==null) {
			head=tail=temp;
			return;
		}
		head.prev=temp;
		temp.next=head;
		head=temp;
	}
	private void reverse() {
		node start=head;
		node temp=null;
		node next=null;
		while(start!=null) {
			next=start.next;
			temp=start.next;
			start.next=start.prev;
			start.prev=temp;
			start=next;
		}
		node change=null;
		change=null;
		head=tail;
		tail=change;
		
	}
	public  int remove() {
		if(head==null) {
			System.out.println("can't delete element");
			return -1;
		}
		int val=tail.data;
		node temp=tail.prev;
		temp.next=null;
		tail=temp;
		size--;
		return val; 
	}
	public  int removefirst() {
		if(head==null) {
			System.out.println("can't delete element");
			return -1;
		}
		int val=head.data;
		if(size==1) {
			head=tail=null;
			size--;
			return -1;
		}
		node temp=head.next;
		head.next=null;
		temp.prev=null;
		head=temp;
		size--;
		return val;
		
	}
	public static void main(String[] args) {
		LL_DoublyLinkedList dl=new LL_DoublyLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.addfront(0);
		dl.removefirst();
		//dl.remove();
		dl.print();
		dl.reverse();
		dl.print();
	}
}
