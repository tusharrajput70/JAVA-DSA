/**
 * Binary_Search_Tree_RootToLeafPaths
 */
import java.util.ArrayList;
public class Binary_Search_Tree_RootToLeafPaths {

	
static class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public static node insert(node root,int val) {
	if(root==null) {
		root=new node(val);
		return root;
	}
	if(root.data>val) {
		root.left=insert(root.left,val);
	}else {
		root.right=insert(root.right,val);
	}
	return root;
}
public static void inorder(node root) {
	if(root==null) {
		return;
	}
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}



//root to leaf
public static void rootTOleaf(node root,ArrayList<Integer> ans) {
	if(root==null) {
		return;
	}
	ans.add(root.data);
	if(root.left==null&&root.right==null) {
		System.out.println(ans);
		ans.remove(ans.size()-1);
		return;
	}

	rootTOleaf(root.left,ans);
	rootTOleaf(root.right,ans);
	ans.remove(ans.size()-1);
}
	public static void main(String[] args) {
		int values[]= {8,5,3,6 ,10,11,14};
		node root=null;
		for(int i=0;i<values.length;i++) {
			root=insert(root,values[i]);
		}
		ArrayList<Integer> ans=new ArrayList<>();
		rootTOleaf(root,ans);
	}
}