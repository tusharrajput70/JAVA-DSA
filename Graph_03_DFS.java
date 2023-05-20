import java.util.*;
public class Graph_03_DFS {
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

        // Using Stack
        public static void dfs(ArrayList<edge> graph[]){
            Stack<Integer> s=new Stack<>();
            boolean vis[]=new boolean[graph.length];
            s.push(0); // Adding source;
            while(!s.isEmpty()){
                int curr=s.pop();
                if(!vis[curr]){ // if curr not visited
                    System.out.print(curr+" ");
                    vis[curr]=true;
                    // now adding its neighbour
                    for(int i=0;i<graph[curr].size();i++){
                        edge e=graph[curr].get(i);
                        s.push(e.dest);
                    }
                }
            }
        }
        public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){
            // visit curr;
            System.out.print(curr+" ");
            vis[curr]=true;

            // calling for neighbours
            for(int i=0;i<graph[curr].size();i++){
                edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    dfs(graph,e.dest,vis);
                }
            }
        }

        // Using Recurssion

        public static void main(String[] args) {
            int v=7;
            @SuppressWarnings("unchecked")
            ArrayList<edge> graph[]=new ArrayList[v];
            createGraph(graph);
            dfs(graph);
            System.out.println();
            boolean vis[]=new boolean[graph.length];
            dfs(graph, 0, vis);
        }
    
}
