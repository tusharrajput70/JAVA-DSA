
import java.util.*;

public class Trees_DeleteNodesWithValueX {
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
	public static node DeleteLeaf(node root,int val) {
		if(root==null) {
			return null;
		}
		root.left=DeleteLeaf(root.left,val);
		root.right=DeleteLeaf(root.right,val);
		if(root.left==null&&root.right==null&&root.data==val) {
			return null;
		}
		return root;
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(3);
		root.right=new node(3);
		root.left.left=new node(3);
		root.left.right=new node(2);
		LevelTraversal(root);
		int val=3;
		//for deleting leaf node with value val
		DeleteLeaf(root,val);
		LevelTraversal(root);
	}

}
