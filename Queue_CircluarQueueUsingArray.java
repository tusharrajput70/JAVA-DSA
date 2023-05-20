
public class Queue_CircluarQueueUsingArray {
	static class queue{
		static int A[];
		static int size;
		static int rear;
		static int front;
		public void queuee(int n){
			A=new int[n];
			size=n;
			rear=-1;
			front=-1;
		}
		public static boolean isEmpty() {
			return rear==-1&&front==-1;
		}
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		public  void enqueue(int data) {
			if(isFull()) {
				System.out.println("Queue overflow");
				return;
			}
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			A[rear]=data;
		}
		public  void dequeue() {
			if(isEmpty()){
				System.out.println("Queue underflow");
				return;
			}
			System.out.println("Dequeued value is:"+A[front]);
			if(front==rear) {		// if there is only one element in queue
				front=rear=-1;
			}else {
			front=(front+1)%size;
			}
		}
		public void display() {
			if(isEmpty()) {
				System.out.println("Queue underflow");
				return;
			}
			for(int i=front;;i=(i+1)%size) {
				if(i==rear) {
					System.out.print(A[i]);
					break;
				}
				System.out.print(A[i]+" ");
			}
			System.out.println();
		}
		
			
		public static void peek() {
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
		q.dequeue();
		q.display();
		q.enqueue(6);
		q.enqueue(7);
		q.display();
		q.enqueue(8);
		
	}

}
