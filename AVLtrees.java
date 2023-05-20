
//incomplete
public class AVLtrees {
	static class node{
		int data,height;
		node left,right;
		public node(int data){
			this.data=data;
			this.height=1;
			//b t w it is automatically null when declared bt for understanding i have written
			this.left=null;
			this.right=null;
		}
	}
	public static int height(node root) {
		if(root==null) {
			return 0;
		}
		return root.height;
	}
	public static int max(int a,int b) {
		return a>b? a:b;
	}
	public static int getbalance(node root) {
		if(root==null) {
			return 0;
		}
		return height(root.left)-height(root.right);
	}
	public static node insert(node root,int key) {
		if(root==null) {
			return new node(key);
		}
		if(root.data>key) {
			root.left=insert(root.left,key);
		}
		else if(root.data<key) {
			root.right=insert(root.right,key);
		}
		return root;
		//root.height = 1 + Math.max(height(root.left),height(root.right));
		//int bf=getbalance(root);
		
	}
	public static void main(String[] args) {
		
	}

}
