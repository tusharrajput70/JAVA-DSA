
public class BackTrackSudoku{
	public static boolean sudokuu(int sudoku[][],int i,int j) {
		//base condition
		if(i==9&&j==0) {
			return true;
		}
		//recursion
		//kaam solve krane k lie
		int nrow=i,ncol=j+1;
		if((j+1)==9) {
			nrow=i+1;
			ncol=0;
		}
		
		if(sudoku[i][j]!=0) {
			return sudokuu(sudoku,nrow,ncol);
		}
		
			for(int n=0;n<=9;n++) {
				if(isSafe(sudoku,i,j,n)) {
					sudoku[i][j]=n;
					if(sudokuu(sudoku,nrow,ncol)) {
						return true;
					}
					sudoku[i][j]=0;
				}
			}
		return false;
	}
	public static boolean isSafe(int sudoku[][],int i,int j,int n) {
		//horizontally
		for(int k=0;k<9;k++) {
			if(sudoku[i][k]==n) {
				return false;
			}
		}
		//vertically
		for(int p=0;p<9;p++) {
			if(sudoku[p][j]==n) {
				return false;
			}
		}
		//in sub-matrix
		int sr=(i/3)*3;
		int sc=(j/3)*3;
		for(int e=sr;e<sr+3;e++) {
			for(int l=sc;l<sc+3;l++) {
				if(sudoku[e][l]==n) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		int sudoku[][]={
				{0,0,8,0,0,0,0,0,0},
				{4,9,0,1,5,7,0,0,2},
				{0,0,3,0,0,4,1,9,0},
				{1,8,5,0,6,0,0,2,0},
				{0,0,0,0,2,0,0,6,0},
				{9,6,0,4,0,5,3,0,0},
				{0,3,0,0,7,2,0,0,4},
				{0,4,9,0,3,0,0,5,7},
				{8,2,7,0,0,9,0,1,3}
		};
		if(sudokuu(sudoku,0,0)==true) {
			System.out.println("Solution exist");
		}
		else {
			System.out.println("Solution doesnt exist");
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(sudoku[i][j]+" ");
			}
			System.out.println();
		}
		
				
	}

}
