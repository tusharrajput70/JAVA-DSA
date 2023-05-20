import java.util.ArrayList;


public class Tries_03_PrefixProblem {
    static class node{
        node children[]=new node[26];
        boolean eow=false;
        int freq;
        public node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static node root=new node(); 
    public static void insert(String word){     //O(L) where L is the length of largest Word
            node curr = root;
            for(int level=0;level<word.length();level++){
                int idx=word.charAt(level)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]=new node();
                }else{
                    curr.children[idx].freq++; 
                }
                curr=curr.children[idx];
            }

            curr.eow=true;
    }
    public static String findPrefix(String key){
        node curr=root;
        StringBuilder s= new StringBuilder("");
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]!=null){
                s.append(key.charAt(level));
                if(curr.children[idx].freq==1){
                    break;
                }
            }
            curr=curr.children[idx];
        }
        return s.toString();
    }



    public static void main(String[] args) {
        String words[]={"zebra","dog","duck","dove"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        root.freq=-1;
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            ans.add(findPrefix(words[i]));
        }
        System.out.println(ans);
    }
}
