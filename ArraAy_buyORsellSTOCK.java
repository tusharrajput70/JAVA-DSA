
public class ArraAy_buyORsellSTOCK {


		public static int profit(int stocks[]) {
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
			if(max==0) {
				return 0;
			}
			else {
			int profit=stocks[maxindex]-stocks[minindex];
			return profit;
			}
		}
		public static void main(String[] args) {
			int stocks[]= {7,1,5,3,6,4};
			System.out.println("maximum acheivable profit is Rs "+profit(stocks));
		}
	}


