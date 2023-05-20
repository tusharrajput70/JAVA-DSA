


public class Trees_KthLevelOfTree {
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
	public static void KthLevel(node root,int level,int k) {
		if(root==null) {
			return;
		}
		if(level==k) {
			System.out.print(root.data+" ");
			return;
		}
		KthLevel(root.left,level+1,k);
		KthLevel(root.right,level+1,k);
	}
	
	
	//additional approach for level order approach
	static int level=1;
	
	public static int levels(node root) {
		if(root==null) {
			return 0;
		}
		if(levels(root.left)==1&&levels(root.right)==1) {
			level++;
		}
		return 1;
	}
	public static void leveltraversal(node root){
		for(int i=1;i<=level;i++) {
			KthLevel(root,1,i);
			System.out.println();
		}
	}
	public static void main(String[] args) {

		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		//levels(root);
		//leveltraversal(root);
		KthLevel(root,1,3);
	}

}
