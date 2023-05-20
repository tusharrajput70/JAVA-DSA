
import java.util.*;

/**
 * Binary_Search_Tree_Merge2BSTs
 */
public class Binary_Search_Tree_Merge2BSTs {

	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	public static node insert(node root,int val) {
		if(root==null) {
			root=new node(val);
			return root;
		}
		if(root.data>val) {
			root.left=insert(root.left,val);
		}else {
			root.right=insert(root.right,val);
		}
		return root;
	}
	public static void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	
	
	
	
	
	
	
	
	public static void INorder(node roott,ArrayList<Integer> arr) {
		if(roott==null) {
			return;
		}
		INorder(roott.left,arr);
		arr.add(roott.data);
		INorder(roott.right,arr);
	}
	public static void mergesort(ArrayList<Integer> ANS,ArrayList<Integer> ans,ArrayList<Integer> ans2) {
		int i=0,j=0;
		while(i<ans.size()&&j<ans2.size()) {
			if(ans.get(i)<=ans2.get(j)) {
				ANS.add(ans.get(i));
				i++;
			}else {
				ANS.add(ans2.get(j));
				j++;
			}
		}
		while(i<ans.size()) {
			ANS.add(ans.get(i));
			i++;
		}
		while(j<ans2.size()) {
			ANS.add(ans2.get(j));
			j++;
		}
	}
	public static node sortedTObalancedBST(ArrayList<Integer> inorder,int si,int ei) {
		if(si>ei) {
			return null;
		}
		
		int mid=(si+ei)/2;
		node r=new node(inorder.get(mid));
		
		r.left=sortedTObalancedBST(inorder,si,mid-1);
		r.right=sortedTObalancedBST(inorder,mid+1,ei);
		return r;
	}
	public static node mergeBST(node root,node root2) {
		ArrayList<Integer> ans=new ArrayList<>();
		ArrayList<Integer> ans2=new ArrayList<>();
		ArrayList<Integer> ANS=new ArrayList<>();
		INorder(root,ans);
		INorder(root2,ans2);
		
		mergesort(ANS,ans,ans2);
		return sortedTObalancedBST(ANS,0,ANS.size()-1);
		
	}

	
	public static void main(String[] args) {
		node root=new node(2);
		root.left=new node(1);
		root.right=new node(4);		//n nodes
		
		node root2=new node(9);
		root2.left=new node(3);
		root2.right=new node(12);	//m nodes
		
		node root3=mergeBST(root,root2);		//time complexity O(n+m)
		preorder(root3);
	}

}
