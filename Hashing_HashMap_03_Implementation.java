import java.util.*;
public class Hashing_HashMap_03_Implementation {
    static class HashMap<K,V>{  // Here K,V are generic or (general data types) which are valid for all types of data types.
        private class node{
            K key;
            V value;
            public node(K key,V value){
                this.key=key;
                this.value=value;

            }
        }
        private int n;   // number of nodes in a block of an array.
        private int N;   // blocks in an array.
        //      (Array data type) ArrayName[];
        private LinkedList<node> Buckets[]; // array of linked list //N

        @SuppressWarnings("unchecked")  // in some versions of java it requires to define the data type of linked list so to savoid that, we use this line.

        public HashMap(){
            this.N=4;
            this.Buckets=new LinkedList[4];
            for(int i=0;i<4;i++){   // creation on empty linked list at 0 to 3 indeces.
                this.Buckets[i]=new LinkedList<>();
            }
        }
        private int HashFunction(K key){
            int hc=key.hashCode();
            // for +ve value we use Math.abs();
            // as we want bi in range of 0 to n-1; so we'll take modulo of hc with n
            return Math.abs(hc)%N;
        }
        private int SearchInLL(K key,int bi){
            LinkedList<node> ll=Buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                node ne=ll.get(i);
                if(ne.key==key){
                    return di;
                }
                di++;
            }
            return-1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<node> oldBuck[] = Buckets;
            Buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<Buckets.length;i++){
                Buckets[i]=new LinkedList<>();
            }

            // nodes add
            for(int i=0;i<oldBuck.length ;i++){
                LinkedList<node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    node k=ll.remove();
                    put(k.key,k.value);
                }
            }
        }
        public void put(K key,V value){     // O(lambda)
            int bi= HashFunction(key);
            int di=SearchInLL(key,bi); // if Already Exist(Updatation of value) we get valid index|| else we get -1 in case of New node.

            if(di!=-1){
                node t=Buckets[bi].get(di);
                t.value=value;
            }else{
                Buckets[bi].add(new node(key, value));
                n++;
            }
            double lambda=n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){     // O(lambda)
            int bi= HashFunction(key);
            int di=SearchInLL(key,bi); // if Already Exist(Updatation of value) we get valid index|| else we get -1 in case of New node.

            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }

        public V get(K key){     // O(lambda)
            int bi= HashFunction(key);
            int di=SearchInLL(key,bi); // if Already Exist(Updatation of value) we get valid index|| else we get -1 in case of New node.

            if(di!=-1){
                node t=Buckets[bi].get(di);
                return t.value;
            }else{
                return null;
            }
        }

        public V remove(K key){     // O(lambda)
            int bi= HashFunction(key);
            int di=SearchInLL(key,bi); // if Already Exist(Updatation of value) we get valid index|| else we get -1 in case of New node.

            if(di!=-1){
                node t=Buckets[bi].remove(di);
                n--;
                return t.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> KeySet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0;i<Buckets.length;i++){
                LinkedList<node> ll=Buckets[i];
                for (node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
        public static void main(String[] args) {
            HashMap<String,Integer> hm= new HashMap<>();
            hm.put("India",100);
            hm.put("China",150);
            hm.put("US",50);
            hm.put("Nepal",5);
            ArrayList<String> keys=hm.KeySet();
            for (String key : keys) {
                System.out.println(key);
            }
            System.out.println(hm.get("India"));
            hm.put("Canada", 3);
            hm.remove("India");
            for (String key : keys) {
                System.out.println(key);
            }
        }
}
