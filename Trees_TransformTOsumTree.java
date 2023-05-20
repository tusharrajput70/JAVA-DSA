
import java.util.*;

public class Trees_TransformTOsumTree {
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
	public static int transformSum(node root) {
		if(root==null) {
			return 0;
		}
		int data=root.data;
		int l=transformSum(root.left);
		int r=transformSum(root.right);
		int lft=(root.left==null)?0:root.left.data;
		int rt=(root.right==null)?0:root.right.data;
		root.data=lft+l+r+rt;
		return data;
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
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		transformSum(root);
		LevelTraversal(root);
	}

}
