import java.util.*;
    // For an unweighted graph considering wt=1;
public class Graph_02_BFS {
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

        public static void bfs(ArrayList<edge> graph[]){    //O(V+E)
            Queue<Integer> q=new LinkedList<>();
            boolean vis[]=new boolean[graph.length];
            q.add(0); // Adding source;
            while(!q.isEmpty()){
                int curr=q.remove();
                if(!vis[curr]){ // if curr not visited
                    System.out.print(curr+" ");
                    vis[curr]=true;
                    // now adding its neighbour
                    for(int i=0;i<graph[curr].size();i++){
                        edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }
        public static void main(String[] args) {
            int v=7;
            @SuppressWarnings("unchecked")
            ArrayList<edge> graph[]=new ArrayList[v];
            createGraph(graph);
            bfs(graph);
        }
}
