
public class Queue_QueueUsingLinkedList {
	public static class node{
			int data;
			node next;
			public node(int data) {
				this.data=data;
				this.next=null;
		}
	}
	static class queue{
	public static node head;
	public static node tail;
	public  void enqueue(int data) {  	//add last
		node newnode=new node(data);
		if(head==null) {
			head=tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	public void dequeue(){				//remove front
		if(head==null) {
			System.out.println("Queue Underflow");
			return;
		}
		if(head==tail) {
			System.out.println("Dequeued data is: "+head.data);
			head=tail=null;
			return;
		}
		System.out.println("Dequeued data is: "+head.data);
		head=head.next;
	}
	public  void peek() {
		if(head==null) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println("Element at top is: "+head.data);
		}
	public  void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	}
	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.display();
		q.dequeue();
		q.display();
	}

}
