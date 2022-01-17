package Project_CS201;

import Project_CS201.TreeNode;

public class TreeNode extends BinaryTree {

	protected SSBU_Character info;
	protected int infoNum;
	protected TreeNode left;
	protected TreeNode right;
	
	TreeNode(SSBU_Character info) {
		this.info = info;
	}
	
	TreeNode(int infoNum) {
		this.infoNum = infoNum;
	}
	
	// Getter that will be used to print integer values of nodes
	public SSBU_Character getInfo() {
		return this.info;
	}
	
	public int getInfoNum() {
		return this.infoNum;
	}
	

}
