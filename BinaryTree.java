package Project_CS201;

import Project_CS201.TreeNode;

public class BinaryTree extends Application_Class{

protected TreeNode root;
	
	public void addTreeNode(SSBU_Character x) {
		
		TreeNode node = new TreeNode(x);
		// First node inserted = root
		if(root==null) {
			root = node;
		// traverse through BST until a null node is open.
		} else {
			TreeNode parent;
			TreeNode currNode = root;
			boolean traverse = true;
			
			while(traverse==true) {
				parent = currNode;
				
				if(node.getInfo().getId() < currNode.getInfo().getId()) {
					currNode = currNode.left;
					
					if(currNode==null) {
						parent.left = node;
						return;
					}
				} else {
					currNode = currNode.right;
					
					if(currNode==null) {
						parent.right = node;
						return;
					}
				}
			}
			
		}
	}
	
public void addTreeNodeNum(int x) {
		
		TreeNode node = new TreeNode(x);
		// First node inserted = root
		if(root==null) {
			root = node;
		// traverse through BST until a null node is open.
		} else {
			TreeNode parent;
			TreeNode currNode = root;
			boolean traverse = true;
			
			while(traverse==true) {
				parent = currNode;
				
				if(node.getInfoNum() < currNode.getInfoNum()) {
					currNode = currNode.left;
					
					if(currNode==null) {
						parent.left = node;
						return;
					}
				} else {
					currNode = currNode.right;
					
					if(currNode==null) {
						parent.right = node;
						return;
					}
				}
			}
			
		}
	}

	// print root, if has left, print and use recursion to repeat until at the lowest value. Then do the same with
	// right side of the tree's left side, but don't include root.
	public void preorderTraversal(TreeNode start) {
		
		if(start != null) {
			
			System.out.println(start.getInfo());
			preorderTraversal(start.left);	
			preorderTraversal(start.right);
		}
	}
	// Start at lowest node and traverse numerically. If has left, go lower, else print currNode, then look at right. 
	// Repeat recursive operations until reaching root then go onto right side of tree.
	public void inorderTraversal(TreeNode start) {
		
		if(start != null) {
			
			inorderTraversal(start.left);
			System.out.println(start.getInfo());
			inorderTraversal(start.right);
		}
	}
	// Start at lowest node, print left, then right, then parent of those two and move through to the right until 
	// left is traversed(Not including root). Do the same on right side, and end off printing root.
	public void postorderTraversal(TreeNode start) {
		
		if(start != null) {
			
			postorderTraversal(start.left);
			postorderTraversal(start.right);
			System.out.println(start.getInfo());
			
		}
	}
	
public void preorderTraversalNum(TreeNode start) {
		
		if(start != null) {
			
			System.out.println(start.getInfoNum());
			preorderTraversalNum(start.left);	
			preorderTraversalNum(start.right);
		}
	}

public void inorderTraversalNum(TreeNode start) {
	
	if(start != null) {
		
		inorderTraversalNum(start.left);
		System.out.println(start.getInfoNum());
		inorderTraversalNum(start.right);
	}
}

public void postorderTraversalNum(TreeNode start) {
	
	if(start != null) {
		
		postorderTraversalNum(start.left);
		postorderTraversalNum(start.right);
		System.out.println(start.getInfoNum());
		
	}
}
	
	public int recursiveSize(TreeNode f) {
		if (f==null) {
			return 0;
		} else {
			return recursiveSize(f.left) + recursiveSize(f.right) + 1;
		}
			
	}
}
