
import java.util.*;

/**
 * Binary_Search_Tree_GreaterSumTreeBST
 */
public class Binary_Search_Tree_GreaterSumTreeBST {

	static class node{
		int data;
		node left,right;
		node(int data){
			this.data=data;
		}
	}
	public static node insertion(node root,int data) {
		if(root==null) {
			return new node(data);
		}
		if(root.data>data) {
			root.left=insertion(root.left,data);
		}
		else if(root.data<data) {
			root.right=insertion(root.right,data);
		}
		return root;
	}
	public static void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	
	public static void INorder(node root,ArrayList<Integer> ans) {
		if(root==null) {
			return ;
		}
		INorder(root.left,ans);
		ans.add(root.data);
		INorder(root.right,ans);
	}
	public static void ALtoG(ArrayList<Integer> ans) {
		for(int i=0;i<ans.size();i++) {
			int k=0;
			for(int j=i+1;j<ans.size();j++) {
				k+=ans.get(j);
			}
			ans.set(i, k);
		}
	}
	public static node arrToBST(ArrayList<Integer> ans,int si,int ei) {
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		node r=new node(ans.get(mid));
		r.left=arrToBST(ans,si,mid-1);
		r.right=arrToBST(ans,mid+1,ei);
		return r;
	}
	public static node togreater(node root) {
		ArrayList<Integer> ans=new ArrayList<>();
		INorder(root,ans);
		ALtoG(ans);
		return arrToBST(ans,0,ans.size()-1);
	}
	public static void main(String[] args) {
		node root=new node(5);
		root.left=new node(3);
		root.left.left=new node(2);
		root.left.right=new node(4);
		root.right=new node(7);
		root.right.left=new node(6);
		root.right.right=new node(8);
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=2;i<=8;i++) {
			a.add(i);
		}
		root=togreater(root);
		inorder(root);
	}

}
