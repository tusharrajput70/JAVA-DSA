import java.util.*;

/**
 * Greedy_KthLargestOddInRange
 */
public class Greedy_KthLargestOddInRange {

	public static int KMaxOdd(int r[],int k) {
		int R=r[1],L=r[0],num=R;
		int count=(int)Math.ceil((R-L+1)/2);
		if(k>count||k<=0) {  //counting the number of odd numbers in range
			return 0;
		}
		if(R%2==0) { //if number is even
			num--;
		}
		num+=2-2*k;
		return num;
	}
	public static void main(String[] args) {
		int r[]= {-10,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of K");
		int k=sc.nextInt();
		System.out.println("Maximum Kth Odd number is: "+KMaxOdd(r,k));
		sc.close();
	}
}
