import java.util.*;;
public class Graph_07_BipartiteGraph {

    //  Graph which dont have cycles will always be bipartile
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

        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));

        graph[3].add(new edge(3,1));
        // graph[3].add(new edge(3,4));

        graph[4].add(new edge(4,2));
        // graph[4].add(new edge(4,3));
    }
    public static boolean isBipartite(ArrayList<edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }


        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){    // agar sbhi vertices ko color nhi mila to yeh chalega means for diconnected graph; 
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();

                    for(int j=0;j<graph[curr].size();j++){
                        edge e=graph[curr].get(j);
                        if( col[e.dest]==-1){   // agar color assign nhi hua hai to hum usse opposite coor assign krenge as curr node.
                            int nextColor= col[curr]== 0 ? 1 : 0;
                            col[e.dest]=nextColor;
                            q.add(e.dest);
                        }
                        else if(col[curr]==col[e.dest]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
            int v=5;
            @SuppressWarnings("unchecked")
            ArrayList<edge> graph[]=new ArrayList[v];
            createGraph(graph);
            System.out.println(isBipartite(graph));
    }
}
