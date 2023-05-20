import java.util.*;
public class Hashing_HashMap_06_Q_MajorityElement {
    public static void main(String[] args) {
              //key   //frequency
        HashMap<Integer,Integer> hm=new HashMap<>();
        int A[]={1,3,2,5,1,3,1,5,1};

        for(int i=0;i<A.length;i++){
            // if(hm.containsKey(A[i])){   // if key already present in Hashmap then increment it's frquency by 1
            //     hm.put(A[i],hm.get(A[i])+1);
            // }else{                      // if not present in HashMap then adding it with frequency 1.
            //     hm.put(A[i],1);
            // }

            // or

            hm.put(A[i],hm.getOrDefault(A[i], 0)+1);  // agar vo key phele se nhi hogi to uski frequency by default zero kr dega

        }
        for (Integer key : hm.keySet()) {
            if(hm.get(key)>A.length/3){
                System.out.println(key);
            }
        }
    }
}
