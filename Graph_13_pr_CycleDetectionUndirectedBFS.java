import java.util.*;
public class Graph_13_pr_CycleDetectionUndirectedBFS {
    static class edge{
        int src;
        int dest;
        public edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,4));

        graph[1].add(new edge(1,0));
        // graph[1].add(new edge(1,4));
        
        graph[2].add(new edge(2,4));
        graph[2].add(new edge(2,3));

        // graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,2));

        graph[4].add(new edge(4,0));
        // graph[4].add(new edge(4,1));
        graph[4].add(new edge(4,2));
        // graph[4].add(new edge(4,3));
    }
    static class pair{
        int n;
        int par;
        public pair(int n,int par){
            this.n=n;
            this.par=par;
        }
    }
    
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
    }
}
