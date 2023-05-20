import java.util.*;
public class Queue_BinaryNoUSingQUEUE {

	public static void main(String[] args) {
		int n=5;
		Queue<String> q=new LinkedList<>();
		String str;
		q.add("1");
		//representation of binary no is like
		//1
		//10
		//11
		//100
		//101
		//110
		//111
		
		//we can see that number is using 0 and 1 to create new number;
		
		//here we begin with no 1
		//then first append 0 to 1 becomes 01
		//then append 1 to 1 becomes 11
		//process continues till the final no. reaches
		while(n-->0) {
			str=q.peek();  //here we are taking the curr peek value in string so that to append 0 and 1 to that
			q.remove();    //as the number is now no longer for use we simply remove that from queue
			System.out.print(str+" ");
			String str2=str;
			q.add(str+"0");
			q.add(str2+"1");
		}
	}

}
