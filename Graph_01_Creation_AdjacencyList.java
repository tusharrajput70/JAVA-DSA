import java.util.*;
/**
 *                       (4)
    (0)                  /
       \                /
        \              /2
         \            /
        5 \         (2)
           \       /   \          
            \    1/     \1
             \   /       \
              (1)-------(3)
                    3
 */
public class Graph_01_Creation_AdjacencyList {
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
    
    public static void main(String[] args) {
        int v=5; //vertices
        // int a[]=new a[size];
        @SuppressWarnings("unchecked")
        ArrayList<edge> [] graph=new ArrayList[v];
        // initially it is null arrayList, now we are converting this arraylist to empty arraylist;
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        //adding edges

        graph[0].add(new edge(0,1,5));

        graph[1].add(new edge(1, 0, 5)); 
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));
        
        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,4,2));
        graph[2].add(new edge(2,3,1));
        
        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3,2,1));
        
        graph[4].add(new edge(4,2,2));

        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.println(graph[i].get(j).src+" "+graph[i].get(j).dest+" "+graph[i].get(j).wt);
            }
        }


        // 2's neighbour
        for(int i=0;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}