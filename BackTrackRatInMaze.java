
public class BackTrackRatInMaze {
	public static int way(int maze[][],int i,int j,int n) {
		
		//base
		if(i==(n-1)&&j==(n-1)) {
			for(int p=0;p<n;p++) {
				for(int q=0;q<n;q++) {
					maze[p][q]=0;
				}
			}
			maze[n-1][n-1]=1;
			return 1;
		}
		//recursion
		else if(i>3||j>3) {
			return 0;
		}
		if(maze[i][j]==0) {
			return 0;
		}
		
		//down
		int w2=way(maze,i+1,j,n);
		if(w2==1) {
			maze[i][j]=1;
		}
		
		//right
		int w4=way(maze,i,j+1,n);
		if(w4==1) {
			maze[i][j]=1;
		}
		
		return w2+w4;
	}
	public static void main(String[] args) {
		int maze[][] = { 
				{ 1, 0, 0, 0 },
				{ 1, 1, 0, 1 },
				{ 0, 1, 0, 0 },
				{ 1, 1, 1, 1 } 
				};
		int k=way(maze,0,0,4);
		System.out.println(k+" ways to solve maze is:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
