public class Tries_01_creation {
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
    public static void insert(String word){     //O(L) where L is the length of largest Word
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
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
