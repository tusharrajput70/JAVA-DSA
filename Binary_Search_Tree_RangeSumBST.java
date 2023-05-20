/**
 * Binary_Search_Tree_RangeSumBST
 */
public class Binary_Search_Tree_RangeSumBST {

	static class node{
		int data;
		node left,right;
		node(int data){
			this.data=data;
		}
	}
	public static node insertion(node root,int data) {
		if(root==null) {
			return new node(data);
		}
		if(root.data>data) {
			root.left=insertion(root.left,data);
		}
		else if(root.data<data) {
			root.right=insertion(root.right,data);
		}
		return root;
	}
	static int sum=0;
	public static int rangesum(node root,int l,int h) {
		if(root==null) {
			return 0;
		}
		if(root.data>=l&&root.data<=h) {//if node data lies between the range
			sum+=root.data;
			rangesum(root.left,l,h);
			rangesum(root.right, l, h);
		}
		//if node data is out of range then it is possible that its right child or left child may lie inside the range for which we checked down condition
		if(root.data<l) {
			rangesum(root.right,l,h);
		}
		if(root.data>h) {
			rangesum(root.left,l,h);
		}
		return sum;
	}
	public static void main(String[] args) {
		node root=new node(8);
		root.left=new node(5);
		root.left.left=new node(2);
		root.left.right=new node(6);
		root.right=new node(10);
		root.right.left=new node(9);
		root.right.right=new node(11);
		int l=7,h=12;
		System.out.println(rangesum(root,l,h));
	}

}