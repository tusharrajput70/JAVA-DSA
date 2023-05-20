import java.util.*;

public class PasswordEncryption_HackerRank {

    
	public static String decryptPassword(String s) {
        ArrayList<Character> a=new ArrayList<>();
          int i=0;
          while(i<s.length()&&i+1<s.length()){
              if(Character.isLowerCase(s.charAt(i))&& Character.isUpperCase(s.charAt(i+1))){
                  a.add(s.charAt(i+1));
                  a.add(s.charAt(i));
                  a.add('*');
                  i=i+2;
              }
              else if(Character.isDigit(s.charAt(i))){
                  a.add(0,s.charAt(i));
                  a.add('0');
                  i++;
              }
              else{
            
                  a.add(s.charAt(i));
                  i++;
              }
          }
          StringBuilder sb=new StringBuilder();
          for(int j=0;j<a.size();j++){
              sb.append(a.get(j));
          }
          return sb.toString();
      }
  public static void main(String[] args) {
      String s="hAck3rr4nk";
      System.out.println(decryptPassword(s));
  }
}