import java.util.*;
public class Hashing_HashMap_07_Q_ValidAnagram {
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                if(hm.get(t.charAt(i))==1){
                    hm.remove(t.charAt(i));
                }else{
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }
            }
            else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String s="tulip";   //O(n)
        String t="lipid";   
        System.out.println(anagram(s,t));
    }
}
