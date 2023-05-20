import java.util.*;
public class Graph_06_CycleDetection_UndirectedGraph {
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
            // ab cycle exit nhi krti agr comment hata donge neeche ki do edges se to hogis
            // graph[0].add(new edge(0,1));
            graph[0].add(new edge(0,2));
            graph[0].add(new edge(0,3));


            // graph[1].add(new edge(1,0));
            graph[1].add(new edge(1,2));
            
            graph[2].add(new edge(2,0));
            graph[2].add(new edge(2,1));

            graph[3].add(new edge(3,0));
            graph[3].add(new edge(3,4));

            graph[4].add(new edge(4,3));
        }
        public static boolean detectCycle(ArrayList<edge> graph[]){ // making our code efficient for diconnected graph.
            boolean vis[]=new boolean[graph.length];
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    if(detectCycleUtil(graph,vis,i,-1)){    // if there are two diconnected component in graph and for one of the part function detects cycle then it retruns true;
                        return true;
                    }
                }
            }
            return false;
        }

        // O(V+E)
        public static boolean detectCycleUtil(ArrayList<edge> graph[],boolean vis[],int curr,int par){
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                edge e= graph[curr].get(i);
                // case 3
                if(!vis[e.dest]){   // agar visited nhi h to uske aage ki nodes k liye check krenge
                    if(detectCycleUtil(graph,vis,e.dest,curr)){     // aur agr uske aage ki calls se hume true mila to true return krenge
                        return true;
                    }
                    
                }
                // case 1    (agar visited hai aur parent nhi h mtlb cycle exit krti h)
                else if(vis[e.dest] && e.dest!=par){
                    return true;
                }
                // case 2 (neighbour visited bhi hai aur parent bhi nhi h to hum kch keh nhi skte to continue krenge)
            }
            return false;
        }
        public static void main(String[] args) {
            int v=5;
            @SuppressWarnings("unchecked")
            ArrayList<edge> graph[]=new ArrayList[v];
            createGraph(graph);
            System.out.println(detectCycle(graph));
        }
}
