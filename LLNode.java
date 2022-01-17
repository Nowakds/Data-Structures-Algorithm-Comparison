package Project_CS201;

public class LLNode extends MyLinkedList{
	
	protected SSBU_Character info;
	protected int infoNum;
	protected LLNode next;
	protected LLNode head;
	
	//default constructor
	public LLNode() {
		info = null;
		infoNum = 0;
		next = null;
		head = null;
	}
	
	public LLNode (SSBU_Character info) {
		
		this.info = info;
		next = null;
		head = null;
		
	}
	
public LLNode (int infoNum) {
		
		this.infoNum = infoNum;
		next = null;
		head = null;
		
	}
	
	public void setLink(LLNode link) {
		this.next = link;
	}
	
}
