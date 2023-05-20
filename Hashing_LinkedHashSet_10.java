import java.util.*;
public class Hashing_LinkedHashSet_10 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
        cities.remove("Delhi");
        System.out.println(cities);
    }
}
