import java.util.ArrayList;

public class Trees_MinimumDisBTW2Nodes {
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
	//for finding minimum distance
	public static int mindis(node root,int n1,int n2) {
		node lca=LCA(root,n1,n2);
		return lcadis(lca,n1)+lcadis(lca,n2);
	}
	
	public static int lcadis(node node,int n1) {
		if(node==null){
			return -1;
		}
		if(node.data==n1) {
			return 0;
		}
		int l=lcadis(node.left,n1);
		int r=lcadis(node.right,n1);
		
		if(l==-1&&r==-1) {
			return -1;
		}else if(l==-1) {
			return r+1;
		}else {
			return l+1;
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
	
	
	
	
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		int n1=4,n2=6;
		System.out.println("Distace btw n1 and n2 is:"+mindis(root,n1,n2));
	}

}
