public class Graph_22_pr_closed_Island {
    public static int island(int mat[][]){
        int ctr=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(islandUtil(mat,i,j)){
                        ctr++;
                    }
                }
            }
        }
        return ctr;
    }
    public static boolean islandUtil(int mat[][],int i,int j){
        if(i-1<0 || i-1>mat.length-1 || i+1<0 || i+1>mat.length-1 ||j-1<0 || j-1>mat[0].length-1 || j+1<0 || j+1>mat[0].length-1){
            return false;
        }
        else if(mat[i][j-1]==0 && mat[i][j+1] ==0 && mat[i+1][j]==0 && mat[i-1][j]==0){ //marking visited indecies as -1 so that it will not check them while traversing
            mat[i][j-1] =-1;
            mat[i][j+1] =-1;
            mat[i+1][j] =-1;
            mat[i-1][j] =-1;
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 0, 0, 0, 0, 1},{0, 1, 1, 1, 1, 0, 0, 1},{0, 1, 0, 1, 0, 0, 0, 1},{0, 1, 1, 1, 1, 0, 1, 0},{0, 0, 0, 0, 0, 0, 0, 1}};

        System.out.println(island(mat));
    }
}
