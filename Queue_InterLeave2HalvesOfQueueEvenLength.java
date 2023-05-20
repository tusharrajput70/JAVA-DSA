import java.util.*;
public class Queue_InterLeave2HalvesOfQueueEvenLength {

	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<>();
		int times=0;
		for(int i=1;i<=10;i++) {
			q1.add(i);
			times++;
		}
		System.out.println(times);
		Queue<Integer> q2=new LinkedList<>();
		Queue<Integer> q3=new LinkedList<>();
		for(int i=0;i<times/2;i++) {
			q2.add(q1.remove());
		}
		System.out.println(q2);
		System.out.println(q1);
		
		while(!q1.isEmpty()){
			q3.add(q2.remove());
			q3.add(q1.remove());
		}
		System.out.println(q3);
	}

}
