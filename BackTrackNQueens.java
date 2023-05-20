
public class BackTrackNQueens {
	static int count=0;
	public static void NQueens(char Chessboard[][],int i) {
		//base condition
		
		if(i==Chessboard.length) {
			count++;
			for(int k=0;k<Chessboard.length;k++) {
				for(int j=0;j<Chessboard.length;j++) {
				System.out.print(Chessboard[k][j]+" ");	
					}
				System.out.println();
				}
			System.out.println("____");
		return;
		}
		//work
		for(int j=0;j<Chessboard.length;j++) { //for changing the value of column
			if(isSafe(Chessboard,i,j))
			{
			Chessboard[i][j]='Q';
			NQueens(Chessboard,i+1);
			Chessboard[i][j]='.';
			}
		}
	}
	public static boolean isSafe(char Chessboard[][],int i,int j) {
		//vertical up
		for(int row=i-1;row>=0;row--) {
			if(Chessboard[row][j]=='Q') {
				return false;
			}
		}
		//diagonal left up
		for(int row=i-1,column=j-1;row>=0&&column>=0;row--,column--) {
			if(Chessboard[row][column]=='Q') {
				return false;
			}
		}
		//diagonal right up
		for(int row=i-1,column=j+1;row>=0&&column<Chessboard.length;row--,column++) {
			if(Chessboard[row][column]=='Q') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=4;
		char Chessboard[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				Chessboard[i][j]='.';
			}
		}
		
		NQueens(Chessboard,0);
		System.out.println("These are the "+count+" ways to solve the problem:");
		
	}

}
