import java.util.*;

public class Hashing_HashSet_09_Iteration {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        
        // ITERATION 
        // 1st Method using iteration
        Iterator<String> it= cities.iterator(); // this makes variable it capable of iteration on set.
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 2nd Method foreach
        for (String string : cities) {
            System.out.println(string);
        }

    }
}
