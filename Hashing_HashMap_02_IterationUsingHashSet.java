import java.util.HashMap;
import java.util.Set;

public class Hashing_HashMap_02_IterationUsingHashSet {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        // DECLARATION of Set
        // Set <DataTypeOfKeyOfHM> keys=hm.keySet();
        Set <String> keys=hm.keySet();  // Used to store all the keys present in Hashmap;
        System.out.println(keys);

        // Using Special loop "foreach"
        for (String k : keys) {
            System.out.println("Key :"+k+", Value: "+hm.get(k));
        }
    }
}
