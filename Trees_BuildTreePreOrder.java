import java.util.*;

public class Trees_BuildTreePreOrder {
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
	
	public  void PreOrderTraversal(node root) {	//O(n)
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
	}
	public  void InOrderTraversal(node root) {	//O(n)
		if(root==null) {
			return;
		}
		InOrderTraversal(root.left);
		System.out.print(root.data+" ");
		InOrderTraversal(root.right);
	}
	public  void PostTraversal(node root) {	//O(n)
		if(root==null) {
			return;
		}
		PostTraversal(root.left);
		PostTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	public  void LevelTraversal(node root) {	//O(n)
		if(root==null) {
			return;
		}
		Queue<node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			node currNode=q.remove();
			if(currNode==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currNode.data+" ");
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
					}
				}
			}
		}
	
	public  int height(node root) {	//O(n)
		if(root==null) {
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		int height=Math.max(lh, rh)+1;
		return height;
		}
	public  int count(node root) {	//O(n)
		if(root==null) {
			return 0;
		}
		int lcount=count(root.left);
		int rcount=count(root.right);
		int totalCount=lcount+rcount+1;		//here 1 is added bcoz of root
		return totalCount;
		}
	public  int nodeSum(node root) {	//O(n)
		if(root==null) {
			return 0;
		}
		int lsum=nodeSum(root.left);
		int rsum=nodeSum(root.right);
		int total=lsum+rsum+root.data;
		return total;
	}
	public  int diameter(node root) {	//O(n^2)
		if(root==null) {
			return 0;
		}
		int leftdia=diameter(root.left);
		int lh=height(root.left);
		int rightdia=diameter(root.right);
		int rh=height(root.right);
		int selfdia=lh+rh+1;
		return Math.max(rightdia, Math.max(selfdia,leftdia));
	}
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};  // pre order seQuence
		BinaryTree tree=new BinaryTree();
		node root=tree.BuildTree(nodes);
		System.out.print("Pre order Traversal: ");
		tree.PreOrderTraversal(root);
		System.out.println();
		System.out.print("In order Traversal: ");
		tree.InOrderTraversal(root);
		System.out.println();
		System.out.print("Post order Traversal: ");
		tree.PostTraversal(root);
		System.out.println();
		System.out.println("Pre order Traversal: ");
		tree.LevelTraversal(root);
		System.out.println("Height = "+tree.height(root));
		System.out.println("No. of nodes = "+tree.count(root));
		System.out.println("Sum of nodes = "+tree.nodeSum(root));
		System.out.println("Diameter of this tree ="+tree.diameter(root));
	}

}
