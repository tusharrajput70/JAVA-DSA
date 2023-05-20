import java.util.*;

public class Graph_20_pr_MotherVertex {
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
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new edge(0,2));
        graph[0].add(new edge(0,3));

        graph[1].add(new edge(1,0));

        graph[2].add(new edge(2,1));

        graph[3].add(new edge(3,4));
    }

    public static boolean isMother(ArrayList<edge> graph[],int src){
        boolean vis[]=new boolean[graph.length];

        isMotherUtil(graph,src,vis);

        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                return false;
            }
        }
        return true;
    }

    public static void isMotherUtil(ArrayList<edge> graph[],int src,boolean vis[]){
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            if(!vis[e.dest]){
                isMotherUtil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);

        for(int i=0;i<graph.length;i++){
            if(isMother(graph,i)){
                System.out.println(i);
            }
        }
    }
}
