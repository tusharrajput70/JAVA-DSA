import java.util.*;

public class Graph_04_HasPath {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));
        
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));
    }


    public static Boolean hasPath(ArrayList<edge> graph[],int src,int dest,boolean vis[]){  //O(V+E)
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            int neighbour=e.dest;
            if(!vis[neighbour] && hasPath(graph, neighbour, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
        boolean vis[]=new boolean[graph.length];
        System.out.println(hasPath(graph, 0, 5, vis));
        
    }
}
