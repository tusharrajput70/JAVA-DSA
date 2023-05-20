

public class Trees_UnivaluedBinaryTree {
	static class node {
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static boolean univaluedTree(node root,int data) {
		if(root==null) {
			return true;
		}
		if(root.data!=data) {
			return false;
		}
		boolean l=univaluedTree(root.left, data);
		boolean r=univaluedTree(root.right,data);
		if(l==true&&r==true) {
			return true;
		}else {
			return false;
		}
		
	}
	static class BinaryTree{
		static int idx=-1;
		public static node BuildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			node newnode=new node(nodes[idx]);
			newnode.left=BuildTree(nodes);
			newnode.right=BuildTree(nodes);
			return newnode;
		}
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(1);
		root.right=new node(1);
		root.left.left=new node(1);
		root.left.right=new node(1);
		System.out.println("is Tree is Univalued ?\n"+univaluedTree(root,root.data));
		
	}

}
