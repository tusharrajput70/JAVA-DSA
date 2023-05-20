public class Tries_05_CountUniqueSubString {
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

    public static int countNodes(node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count +=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str="apple";

        // suffix ->insert trie
        for(int i=0;i<str.length();i++){
            String suff=str.substring(i);
            insert(suff);
        }
        System.out.println(countNodes(root));
    }
}
