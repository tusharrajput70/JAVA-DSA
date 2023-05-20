
public class Trees_SubTreeOfAtree {
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
	public static boolean isIdentical(node node,node subroot) {
		if(node==null&&subroot==null) {
			return true;
		}else if(node==null||subroot==null||node.data!=subroot.data) {
			return false;
		}
		
		if(!isIdentical(node.left,subroot.left)) {
			return false;
		}
		if(!isIdentical(node.right,subroot.right)) {
			return false;
		}
		return true;
		
	}
	public static boolean isSubtree(node root,node subroot) {
		if(root==null) {
			return false;
		}
		if(root.data==subroot.data) {
			if(isIdentical(root,subroot)) {
				return true;
			}
		}
		return isSubtree(root.left,subroot)||isSubtree(root.right,subroot);
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		
		
		node subroot=new node(2);
		subroot.left=new node(4);
		subroot.right=new node(5);
		System.out.println(isSubtree(root,subroot));
		
	}
}
