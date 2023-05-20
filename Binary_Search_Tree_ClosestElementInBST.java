/**
 * Binary_Search_Tree_ClosestElementInBST
 */
public class Binary_Search_Tree_ClosestElementInBST {

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
	static int min=Integer.MAX_VALUE;
	static int nearest=0;
	public static int diff(int a,int b) {
		return a>b?a-b:b-a;
	}
	public static int findNearest(node root,int key) {
		if(root==null) {
			return min;
		}
		if(min>diff(root.data,key)) {
			nearest=root.data;
			min=diff(root.data,key);
		}
		if(root.data>key) {
			findNearest(root.left,key);
		}
		if(root.data<key) {
			findNearest(root.right,key);
		}
		return nearest;
	}
	public static void main(String[] args) {
		node root=new node(8);
		root.left=new node(5);
		root.left.left=new node(2);
		root.left.right=new node(6);
		root.right=new node(10);
		root.right.left=new node(9);
		root.right.right=new node(11);
		int key=1;
		System.out.println("Element nearest to key is "+findNearest(root,key)+" with diff "+min);
	}
}
