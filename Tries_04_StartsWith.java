public class Tries_04_StartsWith {
    static class node {
        node children[]=new node[26];
        boolean eow=false;

        public node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
        
    }

    public static node root=new node();
    public static void insert(String word){
        node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new node();
            }
            curr=curr.children[idx];
        }
    }


    public static boolean StartsWith(String prefix){
        node curr=root;
        for(int level=0;level<prefix.length();level++){
            int idx=prefix.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(StartsWith("app"));
        System.out.println(StartsWith("moon"));
        System.out.println(StartsWith("wo"));
    }
}
