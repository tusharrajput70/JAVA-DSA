import java.util.*;
public class Graph_15_Prims_Algorithum {
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
        graph[0].add(new edge(0,1,10));
        graph[0].add(new edge(0,2,15));
        graph[0].add(new edge(0,3,30));


        graph[1].add(new edge(1,0,10));
        graph[1].add(new edge(1,3,40));


        graph[2].add(new edge(2,0,15));
        graph[2].add(new edge(2,3,50));


        graph[3].add(new edge(3,1,40));
        graph[3].add(new edge(3,2,50));

    }
    static class pair implements Comparable<pair>{
        int vert;
        int dist;
        public pair(int vert,int dist){
            this.vert=vert;
            this.dist=dist;
        }

        @Override
        public int compareTo(pair p2){
            return this.dist-p2.dist;
        }
    }

    public static int prims(ArrayList<edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0, 0));
        int finalCost=0;
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.vert]){
                vis[curr.vert]=true;
                finalCost+=curr.dist;

                //neighbours
                for(int i=0;i<graph[curr.vert].size();i++){
                    edge e=graph[curr.vert].get(i);
                    pq.add(new pair(e.dest,e.wt));
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);

        System.out.println("MST is :"+prims(graph));
    }
}
