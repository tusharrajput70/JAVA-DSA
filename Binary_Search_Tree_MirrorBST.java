
/**
 * Binary_Search_Tree_MirrorBST
 */
public class Binary_Search_Tree_MirrorBST {

	
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
	public static node mirror(node root) {
		if(root==null) {
			return null;
		}
		node lefts=mirror(root.left);
		node rights=mirror(root.right);
		
		root.left=rights;
		root.right=lefts;
		return root;
	}
	public static void main(String[] args) {
		int values[]= {8,5,3,6,10,11,14};
		node root=null;
		for(int i=0;i<values.length;i++) {
			root=insert(root,values[i]);
		}
		inorder(root);
		System.out.println();
		root=mirror(root);
		inorder(root);
	}

}
