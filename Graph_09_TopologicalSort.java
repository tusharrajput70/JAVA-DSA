import java.util.*;
public class Graph_09_TopologicalSort {
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

        graph[2].add(new edge(2,3));

        graph[3].add(new edge(3,1));

        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));


        graph[5].add(new edge(5,0));
        graph[5].add(new edge(5,2 ));


    }
    public static void topologicalSort(ArrayList<edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalSortUtil(graph,i,vis,s);
            }
        }

        // now printing Stack;
        while(!s.isEmpty()){
           System.out.print(s.pop()+" "); 
        }
    }
    public static void topologicalSortUtil(ArrayList<edge> graph[],int curr,boolean vis[], Stack<Integer> s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);      
        topologicalSort(graph);
    }
}
