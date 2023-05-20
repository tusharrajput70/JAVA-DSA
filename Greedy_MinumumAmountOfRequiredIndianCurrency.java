import java.util.*;

/**
 * Greedy_MinumumAmountOfRequiredIndianCurrency
 */
public class Greedy_MinumumAmountOfRequiredIndianCurrency {

	public static void main(String[] args) {
		Integer currency[]= {1,2,5,10,20,50,100,200,500,2000};
		//firstly we have to sort currency in ascending order and then will traverse from the end or in descending order and then will traverse from the beginning
		Arrays.sort(currency,Comparator.reverseOrder());
		Scanner sc=new Scanner((System.in));
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		ArrayList<Integer> ans=new ArrayList<>();
		int coins=0;
		for(int i=0;i<currency.length;i++) {
			if(currency[i]<=amount) {
				while(currency[i]<=amount) {
				coins++;
				amount-=currency[i];
				ans.add(currency[i]);
				}
			}
			if(amount==0) {	// for ending loop when we got our greed full
				break;
			}
		}
		System.out.println("Coins Required are:"+coins+" and are as shown "+ans);
		sc.close();
	}

}
