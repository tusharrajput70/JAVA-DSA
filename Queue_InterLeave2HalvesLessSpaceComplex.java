import java.util.*;

public class Queue_InterLeave2HalvesLessSpaceComplex {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=10;i++) {
			q.add(i);
		}
		int times=q.size();
		Queue<Integer> first=new LinkedList<>();
		for(int i=0;i<times/2;i++) {
			first.add(q.remove());
		}
		System.out.println(first);
		System.out.println(q);
		while(!first.isEmpty()) {
			q.add(first.remove());
			q.add(q.remove());
		}
		System.out.println(q);
	}

}
