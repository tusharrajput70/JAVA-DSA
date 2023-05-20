// hashmap is a data structure as similar as dictionaries in  python, it holds key value pair,in which all keys are uunique



// |S.no     |HASH OPERATIONS     |Time complexities |
// |1.       |put(key,value)      | O(1)             |
// |2.       |get(key)            | O(1)             |
// |3.       |containskey(key)    |  O(1)            |
// |4.       |remove(key)         | O(1)             |

// PROPERTIES
// 1.Fast performance: HashMap provides constant-time performance for basic operations such as adding, retrieving, and removing elements, making it a highly efficient data structure for large datasets.

// 2.Unordered: HashMap does not maintain the order of elements in the collection, meaning that there is no guarantee that the elements will be retrieved in the same order as they were inserted.

// 3.Null values: HashMap allows null values for both keys and values. However, it is important to note that a single key can only be associated with one value at a time.

// 4.Non-synchronized: HashMap is not thread-safe, meaning that it is not suitable for use in multi-threaded environments without proper synchronization. If you need thread safety, you should consider using the ConcurrentHashMap class.

// 5.Iteration: HashMap provides several methods for iterating over its elements, including keySet(), values(), and entrySet().

// 6.Capacity: HashMap has a default capacity of 16, but it can be increased to accommodate more elements. When the number of elements exceeds a certain threshold (known as the load factor), the capacity of the HashMap is automatically increased to maintain performance.

// 7.Collision resolution: In case of hash collisions (i.e., when two or more keys map to the same index in the internal array), HashMap uses a linked list to store the colliding elements.

// IMPORTING MODULE
import java.util.HashMap;

// DECLARATION
// HashMap<dataTypeOfkey,dataTypeOfValue> hm = new HashMap<>();


// IMPORTANT POINTS
// 1. if want to update a key, simply put the key element again with the updates value

public class Hashing_HashMap_01_Operations {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //Insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        //Printing
        System.out.println(hm);
        // get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Pakistan"));// if the value of a particular key is not present in Hashmap then it return null 
        // contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));//false

        // remove
        System.out.println(hm.remove("China")); // deletes the key, value and return value.
        System.out.println(hm.remove("Indonesia"));// returns null
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isempty
        System.out.println(hm.isEmpty());
        // clear deletes all the value present in Hashmap
        hm.clear(); // returns true
        System.out.println(hm);

    }
    
}