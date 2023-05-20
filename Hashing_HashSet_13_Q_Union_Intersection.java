import java.util.*;
public class Hashing_HashSet_13_Q_Union_Intersection {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};
        // Union    O(n+m)
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        System.out.println("Union:\n"+set);
        set.clear();
        //Intersection  O(n+m)
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        HashSet<Integer> intersection=new HashSet<>();
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                set.remove(b[i]);   
                intersection.add(b[i]);
            }
        }

        System.out.println("Intersection:\n"+intersection);

    }
}
