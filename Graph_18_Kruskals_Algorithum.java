import java.util.*;
public class Graph_18_Kruskals_Algorithum {
    static class edge implements Comparable<edge>{
        int src;
        int dest;
        int wt;
        public edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }

        @Override
        public int compareTo(edge e2){
            return this.wt-e2.wt;
        }
    }

    public static void createGraph(ArrayList<edge> edges){
        edges.add(new edge(0,1,10));
        edges.add(new edge(0,2,15));
        edges.add(new edge(0,3,30));
        edges.add(new edge(1,3,40));
        edges.add(new edge(2,3,50));
    }


    static int n=4;//vertices
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

    public static void kruskalsMST(ArrayList<edge> edges ,int v){   //O(V + ElogE)
        init();
        Collections.sort(edges);    //O(E logE);
        int mstCost=0;
        int count=0;
        for(int i=0;count<v-1;i++){ //O(V)
            edge e= edges.get(i);
            //(src,dest,wt)

            int parA=find(e.src);
            int parB=find(e.dest);

            if(parA!=parB){ // no cycle formmation
                union(e.dest,e.src);
                mstCost+=e.wt;
                count++;
            }
        }

        System.out.println("Cost of MST: "+mstCost);
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> edges=new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, v);
    }
}
