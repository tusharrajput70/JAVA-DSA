import java.util.*;

public class LeetCode_45_MinimumJumpToReach {
    static class value implements Comparable<value>{
        int jump;
        int v;
        public value(int jump,int v){
            this.jump=jump;
            this.v=v;
        }
        @Override
		public int compareTo(value r) {
			return r.v-this.v;
		}
    }
    public static int Minimum(int A[]){
        int start=0;
        if(A[start]==0){
            return -1;
        }
        while(start!=A.length){
            PriorityQueue<value> pq=new PriorityQueue<>();
            int val=A[start];
            while(val!=0){
                pq.add(new value(val,A[start+val]));
                val--;
            }
            value v=pq.remove();
            
        }

    }

    public static void main(String[] args) {
        
    }
}
