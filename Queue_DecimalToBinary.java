import java.util.*;

public class Queue_DecimalToBinary {
	public static void deciToBinary(int n) {
		Stack<Integer> q=new Stack<>();
		int num=n,rem=0;
		while(num!=0){
			rem=num%2;
			num=num/2;
			q.add(rem);
		}
		while(!q.isEmpty()) {
			System.out.print(q.pop());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			deciToBinary(i);
			System.out.print(" ");
		}
		sc.close();
	}

}
