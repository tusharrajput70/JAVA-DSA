import java.util.*;

public class Graph_23_StronglyConnectedComponents_kosarajus_Algoithum {
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

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
    }

    public static void topologicalSort(ArrayList<edge> graph[],int curr,Stack<Integer> s,boolean vis[]){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSort(graph, e.dest, s, vis);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList<edge> transpose[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<transpose[curr].size();i++){
            edge e=transpose[curr].get(i);
            if(!vis[e.dest]){
                dfs(transpose, e.dest, vis);
            }

        }
    }
    public static void kosaraju(ArrayList<edge> graph[],int v){ //O(V+E)

        // Step 1 (topological sort in stack)
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[v];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalSort(graph,i,s,vis);
            } 
        }
        // Step 2 (Transpose of Graph)
        @SuppressWarnings("unchecked")
        ArrayList<edge> transpose[]=new ArrayList[v];
        // Initializing Transpose;
        for(int i=0;i<v;i++){
            vis[i]=false;   // To use this vis array again
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                edge e=graph[i].get(j);
                transpose[e.dest].add(new edge(e.dest, e.src));
            }
        }


        //  Step 3 (DFS on transpose Graph)
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("SSC-> ");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];

        createGraph(graph);
        kosaraju(graph, v); //O(V+E)

    }
}
