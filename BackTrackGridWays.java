
public class BackTrackGridWays {
	public static int gridways(int i,int j,int n,int m) {
		//base case
		if(i==n-1&&j==m-1) {
			return 1;
		}
		else if(i==n||j==m) {
			return 0;
		}
		//right movement
		int w1=+gridways(i,j+1,n,m);
		int w2=+gridways(i+1,j,m,n);
		return (w1+w2);
	}
	public static void main(String[] args) {
		int n=4,m=4;
		int k=gridways(0,0,n,m);
		System.out.println(k+" No. of ways");
	}

}
