public class Graph_19_FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][]=new boolean[image.length][image[0].length];

        if(image[sr][sc]!=0){
            helper1(image,sr,sc, color ,vis);
        }
        else{
            
        }
        return image;
    }
    public static void helper1(int [][] image,int sr,int sc, int color,boolean vis[][]){

        if(sr<0 || sc<0 ||sr>image.length-1 || sc>image[0].length-1 || vis[sr][sc] || image[sr][sc]==0){
            return;
        }
        image[sr][sc]=color;
        vis[sr][sc]=true;
        // left
        helper1(image, sr, sc-1, color, vis);
        // right
        helper1(image, sr, sc+1, color, vis);
        
        // up
        helper1(image, sr-1, sc, color, vis);

        // down
        helper1(image, sr+1, sc, color, vis);

    }
    public static void helper2(int [][] image,int sr,int sc, int color,boolean vis[][]){

        if(sr<0 || sc<0 ||sr>image.length-1 || sc>image[0].length-1 || vis[sr][sc] ){
            return;
        }
        image[sr][sc]=color;
        vis[sr][sc]=true;
        // left
        helper2(image, sr, sc-1, color, vis);
        // right
        helper2(image, sr, sc+1, color, vis);
        
        // up
        helper2(image, sr-1, sc, color, vis);

        // down
        helper2(image, sr+1, sc, color, vis);

    }

    public static void main(String[] args) {
        int [][]image={
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        floodFill(image, 1, 1, 2);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
