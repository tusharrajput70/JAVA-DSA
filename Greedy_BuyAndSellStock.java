
import java.util.*;

/**
 * Greedy_BuyAndSellStock
 */
public class Greedy_BuyAndSellStock {

	
	public static void main(String[] args) {
		//Question Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible for buying and selling the stocks on different days using transactions where at most one transaction is allowed. Note: Stock must be bought before being sold
		int price[]= {7, 1, 5, 3, 6, 4};
		int pi[][]=new int[price.length][2];
		// here we create 2d array in which 0th column represents index and 1st column represents price so that we can track the day of lowest and highest price
		for(int i=0;i<price.length;i++) {
			pi[i][0]=i;
			pi[i][1]=price[i];
		}
		Arrays.sort(pi,Comparator.comparingDouble(o->o[1]));
		}
}
