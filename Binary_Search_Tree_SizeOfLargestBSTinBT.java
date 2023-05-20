/**
 * Binary_Search_Tree_SizeOfLargestBSTinBT
 */
public class Binary_Search_Tree_SizeOfLargestBSTinBT {

	
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
	
	
	//ans
	
	static class info{
		boolean isBST;
		int size;
		int min;
		int max;
		public info(boolean isBST,int size,int min,int max) {
			this.isBST=isBST;
			this.size=size;
			this.min=min;
			this.max=max;
		}
	}
	public static int maxBST=0;
	public static info largestBST(node root) {
		
		if(root==null) {
			return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		info left=largestBST(root.left);
		info right=largestBST(root.right); 
		int size=left.size+right.size+1;
		int min=Math.min(root.data,Math.min(left.min, right.min));
		int max=Math.max(root.data,Math.max(left.max, right.max));
		
		if(root.data<=left.max||root.data>=right.min) {
			return new info(false,size,min,max);
		}
		
		if(left.isBST&&right.isBST) {
			maxBST=Math.max(maxBST, size);
			return new info(true,size,min,max);
		}
		
		return new info(false,size,min,max);
	}
	
	public static void main(String[] args) {
		node root=new node(50);
		root.left=new node(30);
		root.left.left=new node(5);
		root.left.right=new node(20);
		root.right=new node(60);
		root.right.left=new node(45);
		root.right.right=new node(70);
		root.right.right.left=new node(65);
		root.right.right.right=new node(80);
		largestBST(root);
		System.out.println("Size of largest BST is: "+maxBST);
		
	}
}