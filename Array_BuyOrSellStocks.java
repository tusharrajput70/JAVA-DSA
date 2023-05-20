
public class Array_BuyOrSellStocks {
	public static void profit(int stocks[]) {
		int n=stocks.length;
		int minindex=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(stocks[i]<min) {
				min=stocks[i];
				 minindex=i;
			}
		}
		int maxindex=0;
		int max=Integer.MIN_VALUE;
		for(int i=minindex;i<n;i++) {
			if(stocks[i]>max) {
				max=stocks[i];
				 maxindex=i;
		    
		    	}
			}
		int profit=stocks[maxindex]-stocks[minindex];
		System.out.println("if you by stocks at day "+(minindex+1)+" and sell it on "+(maxindex+1)+" then you can have maximum profit of Rs."+profit);
	}
	public static void main(String[] args) {
		int stocks[]= {7,1,5,3,6,4};
		profit(stocks);

	}

}
