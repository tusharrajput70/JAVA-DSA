import java.util.*;
/**
 * Greedy_MinimumAbsolutePairs
 */
public class Greedy_MinimumAbsolutePairs {

	public static void main(String[] args) {
		int A[]= {4,1,8,7};
		int B[]= {2,3,6,5};
		int sum=0;
		//to get minimum sum we have to sort both the arrays such that large numbers get subtracted with large pairs and small number get subtracted with small ones
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0;i<A.length;i++) {
			sum+=Math.abs(A[i]-B[i]);
		}
		System.out.println("Minimum absolute diff of pairs is: "+sum);
	}

}
