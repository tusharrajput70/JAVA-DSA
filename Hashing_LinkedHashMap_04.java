import java.util.*;

public class Hashing_LinkedHashMap_04 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);
        System.out.println(lhm);


        // HashMap Comparision with LinkedHashMap.
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm); // values when printed order is not same as we inputed them.
    }
    
}