import java.util.*;
public class Hashing_HashSet_12_Q_CountingDistinctElements {
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){  //O(n)
            set.add(arr[i]);
        }
        System.out.println("Number of distinct elements is:"+set.size());


        // BruteForce Approach  //O(n^2)
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){  
            if(!result.contains(arr[i])){
                result.add(arr[i]);
            }
        }
        System.out.println("Number of distinct elements is:"+result.size());

        
    }
}
