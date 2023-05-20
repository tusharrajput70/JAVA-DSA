
public class Tries_02_WordBreakProblem {
    static class node{
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
            node curr = root;
            for(int level=0;level<word.length();level++){
                int idx=word.charAt(level)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]=new node();
                }
                curr=curr.children[idx];
            }

            curr.eow=true;
    }
    public static boolean search(String key){
        node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            //substring (beg idx,last idx)
           if(search( key.substring(0, i))&& wordBreak(key.substring(i))){
                return true;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
