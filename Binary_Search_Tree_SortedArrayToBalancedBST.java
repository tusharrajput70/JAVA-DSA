/**
 * Binary_Search_Tree_SortedArrayToBalancedBST
 */
public class Binary_Search_Tree_SortedArrayToBalancedBST {

	
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
	
	public static node arrToBST(int arr[],int si,int ei) {
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		node root=new node(arr[mid]);
		root.left=arrToBST(arr,si,mid-1);
		root.right=arrToBST(arr,mid+1,ei);
		return root;
	}
	public static void main(String[] args) {
		int arr[]= {3,5,6,8,10,11,12};
		node root=null;
		root=arrToBST(arr,0,arr.length-1);
		inorder(root);
		System.out.println();
		preorder(root);
	}

}