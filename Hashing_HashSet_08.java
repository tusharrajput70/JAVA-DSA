// hashset is a data structure similar as sets in python.
// PROPERTIES
// 1. no duplicates/Uniqness
// 2. Unordered
// 3. Null is allowed (fy)
// 4. Mutable

// A HashSet is implemented Using HashMap in java, in which Element is Stored as Key having dummy value Corresponding to it for every element.

// OPERATIONS
// 1. add(key)
// 2. contains(key)
// 3. remove(key)

// IMPORTING MODULE
import java.util.HashSet;

public class Hashing_HashSet_08 {
    public static void main(String[] args) {
        // DECLARATION
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        set.clear();    //empty set
        System.out.println(set.isEmpty() );
        System.out.println(set.size());
    }


}
