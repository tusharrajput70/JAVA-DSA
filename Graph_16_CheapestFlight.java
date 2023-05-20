// Cheapest Flights within K Stops


// There are n cities connected by some number of flights. You are given an array flights where
// flights[i] = [from, to, price] indicates that there is a flight.
// You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
// If there is no such route, return -1.
// all values are positive

import java.util.*;;
public class Graph_16_CheapestFlight {
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

    public static void createGraph(ArrayList<edge> graph[],int flight[][]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<flight.length;i++){
            int src=flight[i][0];
            int dest=flight[i][1];
            int wt=flight[i][2];
            graph[src].add(new edge(src, dest, wt));
        }
    }


    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops){
            this.v=v;
            this.cost=cost;
            this.stops=stops;
        }
    }
    public static int cheapestFlight(int n,int flight[][], int src , int dest,int k){
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[n];
        createGraph(graph, flight);

        int dist[]=new int [graph.length];

        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++){
                edge e=graph[curr.v].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(dist[u]!=Integer.MAX_VALUE && dist[v]>curr.cost+ wt && curr.stops<=k){
                    dist[v]=curr.cost+ wt;
                    q.add(new Info(v, dist[v], curr.stops+1));

                }
            }
        }

        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }


    }
    
    public static void main(String[] args) {
        int n=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
       
        int src=0,dest=3,k=1;
        System.out.println( cheapestFlight(n, flight, src, dest, k));
    }
}
