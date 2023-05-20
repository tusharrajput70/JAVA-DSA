import java.util.*;
public class Hashing_HashMap_14_Q_FindItineraryTickets {
    public static String getStart(HashMap<String,String> ticket){
        //          To,From
        HashMap<String,String> revMap=new HashMap<>();
        for (String key : ticket.keySet()) {
            revMap.put(ticket.get(key),key);
        }
        for (String key : ticket.keySet()) {
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        //      From,To
        HashMap<String,String> ticket=new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        String start=getStart(ticket);
        System.out.print(start);
        while(ticket.containsValue(ticket.get(start))){
            System.out.print(" -> "+ticket.get(start));
            start=ticket.get(start);
        }
    }
}
