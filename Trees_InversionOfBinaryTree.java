import java.util.*;

public class Trees_InversionOfBinaryTree {
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
	
	

	public static void LevelTraversal(node root) {	//O(n)
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
	
	
	//inversion
	public static void inversion(node root) {
		if(root==null) {
			return;
		}
		if(root.left!=null&&root.right!=null) {
			int val=root.left.data;
			root.left.data=root.right.data;
			root.right.data=val;
		}
		
		
		//if node has only one child
		//else if(root.left!=null&&root.right==null) {
			//root.right=new node(root.left.data);
			//root.left=null;
		//}
		//else if(root.right!=null&&root.left==null) {
			//root.left=new node(root.right.data);
			//root.right=null;
		//}
		inversion(root.left);
		inversion(root.right);
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		LevelTraversal(root);
		inversion(root);
		LevelTraversal(root);
		
	}

}
