
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_JCF {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(3);
		pq.add(4);
		pq.add(1);
		//System.out.println(pq);
		pq.remove();
		//System.out.println(pq);  
		
		
		//for reverse order//descending order
		PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
		p.add(1);
		p.add(2);
		p.add(7);
		while(!p.isEmpty()) {
		System.out.println(p.peek());
		p.remove();
		}
	}

}
