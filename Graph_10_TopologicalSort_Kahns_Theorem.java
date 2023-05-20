import java.util.*;
public class Graph_10_TopologicalSort_Kahns_Theorem {
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
    public static void calcIndeg(ArrayList<edge> graph[],int indeg[]){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                edge e= graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<edge> graph[]){
        int indeg[]=new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);  
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);      
        topSort(graph);
    }
}
