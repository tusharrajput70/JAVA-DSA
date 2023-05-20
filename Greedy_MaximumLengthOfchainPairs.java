import java.util.*;

/**
 * Greedy_MaximumLengthOfchainPairs
 */
public class Greedy_MaximumLengthOfchainPairs {

	public static void main(String[] args) {//O(nlogn)
		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		//here column 0 represents starting of chain
		//column 1 represents ending of chain
		
		//sorting of ending of chain
		Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
  
		int chain=1;
		int chainend=pairs[0][1]; //last chain end
		//now applying condition
		for(int i=1;i<pairs.length;i++) {
			if(chainend<=pairs[i][0]) {
				chain++;
				chainend=pairs[i][1];
			}
		}
		System.out.println("Maximum Length of chain pairs is:"+chain);
	}
}
