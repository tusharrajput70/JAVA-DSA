

public class Trees_DiameterOfTree2Approach {
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
		public node BuildTree(int nodes[]) {
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
	static class info{
		int dia;
		int ht;
		public info(int dia,int ht) {
			this.dia=dia;
			this.ht=ht;
		}
	}
	public static info diameter(node root) {
		if(root==null) {
			return new info(0,0);
		}
		info leftinfo=diameter(root.left);
		info rightinfo=diameter(root.right);
		int dia=Math.max(leftinfo.dia, Math.max(rightinfo.dia, leftinfo.ht+rightinfo.ht+1));
		int ht=leftinfo.ht+rightinfo.ht+1;
		
		return new info(dia,ht);
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};  // pre order seQuence
		BinaryTree tree=new BinaryTree();
		node root=tree.BuildTree(nodes);
		System.out.println("diameter = "+diameter(root).dia);
	}
	}

