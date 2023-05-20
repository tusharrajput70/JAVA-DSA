
public class Queue_QueueUsingArray {
	static class queue{
		static int A[];
		static int size;
		static int rear;
		public void queuee(int n){
			A=new int[n];
			size=n;
			rear=-1;
		}
		public static boolean isEmpty() {
			return rear==-1;
		}
		public void enqueue(int data) {
			if(rear==size-1) {
				System.out.println("Queue overflow");
				return;
			}
			rear++;
			A[rear]=data;
		}
		public void dequeue() {
			if(isEmpty()){
				System.out.println("Queue underflow");
				return;
			}
			System.out.println("Dequeued value is:"+A[0]);
			for(int i=0;i<rear;i++) {
				A[i]=A[i+1];
			}
			rear--;
		}
		public  void display() {
			if(rear==-1) {
				System.out.println("Queue underflow");
				return;
			}
			for(int i=0;i<=rear;i++) {
				System.out.print(A[i]+" ");
			}			
			System.out.println();
		}
		public  void peek() {
			System.out.println("Value at top is: "+A[rear]);
		}
	}
	public static void main(String[] args) {
		queue q=new queue();
		q.queuee(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(6);
		q.display();
		q.enqueue(7);
		q.display();
	}

}
