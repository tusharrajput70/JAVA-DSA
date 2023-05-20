
import java.util.ArrayList;

/**
 * Binary_Search_Tree_BSTtoBalancedBST
 */
public class Binary_Search_Tree_BSTtoBalancedBST {

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
	public static void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	
	
	public static void INorder(node root,ArrayList<Integer> inorder) {
		if(root==null) {
			return;
		}
		INorder(root.left,inorder);
		inorder.add(root.data);
		INorder(root.right,inorder);
	}
	public static node sortedTObalancedBST(ArrayList<Integer> inorder,int si,int ei) {
		if(si>ei) {
			return null;
		}
		
		int mid=(si+ei)/2;
		node root=new node(inorder.get(mid));
		
		root.left=sortedTObalancedBST(inorder,si,mid-1);
		root.right=sortedTObalancedBST(inorder,mid+1,ei);
		return root;
	}
	
	
	//main
	public static node balanceBST(node root) {			//O(n);
		ArrayList<Integer> inorder=new ArrayList<>();
		INorder(root,inorder);
		
		return sortedTObalancedBST(inorder,0,inorder.size()-1);
	}
	public static void main(String[] args) {
		node root=new node(8);
		root.left=new node(6);
		root.left.left=new node(5);
		root.left.left.left=new node(3);
		
		root.right=new node(10);
		root.right.right=new node(11);
		root.right.right.right=new node(12);
		
		root=balanceBST(root);
		inorder(root);
		System.out.println();
		preorder(root);
	}
}
