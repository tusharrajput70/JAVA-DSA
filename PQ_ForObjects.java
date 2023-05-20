import java.util.*;

public class PQ_ForObjects {
	static class student implements Comparable<student>{	//overriding
		String name;
		int rank;
		public student(String name,int rank) {
			this.name=name;
			this.rank=rank;
		}
		//important
		@Override
		public int compareTo(student s) {
			return this.rank-s.rank;
		}
	}
	public static void main(String[] args) {
		PriorityQueue<student> s=new PriorityQueue<>();
		s.add(new student("tushar",2));
		s.add(new student("naina",1));
		s.add(new student("lakshay",3));
		while(!s.isEmpty()) {
			System.out.println("Rank "+s.peek().rank +" "+ s.peek().name);
			s.remove();
		}
	}

}
