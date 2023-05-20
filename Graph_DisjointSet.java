 public class Graph_DisjointSet {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        // yeh value is liye isme assign kri gyi hai taaki tb bhi next time kisi 'x' element k liye par pucha jaye to vo seedha uske par[] array m mil jaye
        //  means here value of par for element [x] get updated.
        return par[x]=find(par[x]);

        // hence reduces complexity
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            //making a parent;
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]>rank[parB]){
            // rank of a greater than rank of then b should come to a;
            par[parB]=parA;
            // no rank updation in last two cases.

            // kyuki tree ka size to tb bada hoga na jb dono same size ke ho aur Leader ko to ek level upr rkhna hota h to rank+1 ho jati h.
        }
        else{
            par[parA]=parB;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);

    }
}
