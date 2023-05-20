
/**
 * Binary_Search_Tree_DeletionOfnodeInBST
 */
public class Binary_Search_Tree_DeletionOfnodeInBST {

	
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
	
	
	//deletion of nodes
	public static node delete(node root,int val) {
		
		if(root.data<val) {
			root.right= delete(root.right,val);
		}
		else if(root.data>val) {
			root.left=delete(root.left,val);
		}
		else {	//	voila
			//case 1 no child
			if(root.left==null&&root.right==null) {
				 return null;
			}
			//case 2 single child
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			//case 3
			node is=InOrderSuccesor(root.right);//ass inorder succesor always lies in the right side
			root.data=is.data;
			root.right=delete(root.right,is.data);
			
		}
		return root;
	}
	public static node InOrderSuccesor(node root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	
	
	
	//printInRange
	public static void printInRange(node root,int k1,int k2) {
		if(root==null) {
			return;
		}
		if(root.data>=k1&&root.data<=k2) {
			printInRange(root.left, k1, k2);
			System.out.print(root.data+" ");
			printInRange(root.right,k1,k2);
		}
		else if(root.data<k1) {
			printInRange(root.right,k1,k2);
		}
		else {
			printInRange(root.left,k1,k2);
		}
	}
	public static void main(String[] args) {
		int values[]= {8,4,3,1,5,6,10,11,14};
		node root=null;
		for(int i=0;i<values.length;i++) {
			root=insert(root,values[i]);
		}
		//inorder(root);
		//System.out.println();
		//root=delete(root,11);
		//inorder(root);
		printInRange(root,5,12);
	}
}