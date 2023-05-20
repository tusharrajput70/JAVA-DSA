import java.util.*;


public class Trees_LeastCommonAncestor {
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
	public static boolean getpath(node root,int n,ArrayList<node> path) {
		if(root==null) {
			return false;
		}
		path.add(root);
		if(root.data==n) {
			return true;
		}
		boolean foundleft=getpath(root.left,n,path);
		boolean foundright=getpath(root.right,n,path);
		if(foundleft||foundright) {
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}
	public static node LCA(node root,int n1,int n2) {	//O(n)
		ArrayList<node> path1=new ArrayList<>();
		ArrayList<node> path2=new ArrayList<>();
		getpath(root,n1,path1);
		getpath(root,n2,path2);
		
		//last common ancestor
		int i=0;
		for(;i<path1.size()&&i<path2.size();i++) {
			if(path1.get(i)!=path2.get(i)) {
				break;
			}
		}
		return path1.get(i-1);
	}
	
	
	//2nd Approach 
	public static node lca2(node root,int n1,int n2) {
		if(root==null) {
			return null;
		}
		if(root.data==n1||root.data==n2) {
			return root;
		}
		node leftlca=lca2(root.left,n1,n2);
		node rightlca=lca2(root.right,n1,n2);
		
		
		if(rightlca==null) {
			return leftlca;
		}
		if(leftlca==null) {
			return rightlca;
		}
		return root;
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		int n1=4,n2=5;
		
		
		System.out.println(LCA(root,n1,n2).data);
		System.out.println(lca2(root,n1,n2).data);
	}

}
