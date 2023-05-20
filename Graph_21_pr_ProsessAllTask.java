// Find whether it is possible to finish all tasks or not There are a total of n tasks you have to pick,
// labelled from 0 to n-1.Some tasks may have prerequisites,for example to pick task 0 you have to first pick task 1,
// which is expressed as a pair:[0,1] Given the total number of tasks and a list of prerequisite pairs,
// is it possible for you to finish all tasks?
// Sample Input 1: [[1, 0], [0, 1]]
// Output 1: false
// Sample Input 2: [[1, 0]]
//  Output 2: true

public class Graph_21_pr_ProsessAllTask {
    static int n=5;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return par[x]=find(par[x]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
        else{
            par[parA]=parB;
        }
    }

    public static boolean Possible(int a[][]){
        init();
        for(int i=0;i<a.length;i++){
            int x=a[i][1];
            int y=a[i][0];
            if(find(x)==find(y)){
                return false;
            }
            else{
                union(x,y);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[][]={
            {1,0}, {2,1}, {3,2}, {4,3}
        };
        System.out.println(Possible(a));
    }
}
