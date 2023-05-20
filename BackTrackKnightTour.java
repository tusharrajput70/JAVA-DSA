
public class BackTrackKnightTour {
	public static boolean knight(int board[][],int i,int j,int n,int val) {
		//base condition
		if(i<0||j<0) {
			return false;
		}
		else if(i>8||j>8) {
			return false;
		}
		if(val>n*n) {
			return false;
		}
		
		//recursion
		if(board[i][j]==0){
			board[i][j]=val++;
			if(isavail(board,(i-1),(j-2))) {
				return true;
			}
			if(isavail(board,(i-2),(j-1))) {
				return true;
			}
			if(isavail(board,(i-2),(j+1))) {
				return true;
			}
			if(isavail(board,(i-1),(j+2))) {
				return true;
			}
			if(isavail(board,(i+1),(j+2))) {
				return true;
			}
			if(isavail(board,(i+2),(j+1))) {
				return true;
			}
			if(isavail(board,(i+1),(j-2))) {
				return true;
			}
			if(isavail(board,(i+2),(j-2))) {
				return true;
			}
			if(isavail(board,(i+2),(j-1))) {
				return true;
			}
		}
		return false;
		
}
	public static boolean isavail(int board[][],int i,int j) {
		if(board[i][j]==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean allfull(int board[][],int n) {
		int ctr=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(board[i][j]==0) {
					ctr++;
				}
			}
		}
		if(ctr==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=8;
		int board[][]=new int[n][n];
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				board[i][j]=0;
			}
		}
		knight(board,0,0,n,1);
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
//not completed