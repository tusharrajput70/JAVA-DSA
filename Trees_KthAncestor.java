

public class Trees_KthAncestor {
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
	public static int KthAncestor(node root,int n1,int k) {
		if(root==null) {
			return -1;
		}
		if(root.data==n1) {
			return 0;
		}
		int l=KthAncestor(root.left,n1,k);
		int r=KthAncestor(root.right,n1,k);
		if(l==-1&&r==-1) {
			return -1;
		}
		int max=Math.max(l, r);
		if(max+1==k) {
			System.out.println(root.data);
		}
		return+1;
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		KthAncestor(root,4,2);
	}	
}
