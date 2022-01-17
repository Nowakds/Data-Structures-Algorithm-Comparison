package Project_CS201;

public class MyLinkedList extends Application_Class {

	LLNode sortNode;
	LLNode head;
	
		public MyLinkedList() {
			super();
		}
		
		public MyLinkedList(SSBU_Character d) {
			super();
		}
		
		public void add(SSBU_Character x) {
			LLNode newNode = new LLNode(x);
			newNode.info = x;
			newNode.setLink(null);
			// if no nodes, make new node the head
			if (head==null) {
				head = newNode;
			} else {
				// end is originally at head and traverses to end and appends once reaches end
				LLNode end = head;
				while(end.next!=null) {
					end = end.next;
				}
				end.next = newNode;
			}

		}
		
		public void add(int x) {
			LLNode newNode = new LLNode(x); 
			newNode.infoNum = x;
			newNode.setLink(null);
			
			if (head==null) {
				head = newNode;
			} else {
				// end is originally at head and traverses to end and appends once reaches end
				LLNode end = head;
				while(end.next!=null) {
					end = end.next;
				}
				end.next = newNode;
			}

		}
		
		

		public void push(SSBU_Character val)
	    {
	        
	        LLNode newnode = new LLNode(val);
	        
	        newnode.next = head;
	        
	        head = newnode;
	    }
	 
	    
	    public void insertionSort(LLNode headref)
	    {
	        
	        sortNode = null;
	        LLNode current = headref;
	        
	        while (current != null)
	        {
	            
	            LLNode next = current.next;
	            
	            sortedInsert(current);
	            
	            current = next;
	        }
	        
	        head = sortNode;
	    }
	    
	    public void insertionSortNum(LLNode headref)
	    {
	        
	        sortNode = null;
	        LLNode current = headref;
	        
	        while (current != null)
	        {
	            
	            LLNode next = current.next;
	            
	            sortedInsertNum(current);
	            
	            current = next;
	        }
	        
	        head = sortNode;
	    }
	 
	    public void sortedInsert(LLNode newnode)
	    {
	        
	        if (sortNode == null || sortNode.info.getId() >= newnode.info.getId())
	        {
	            newnode.next = sortNode;
	            sortNode = newnode;
	        }
	        else
	        {
	            LLNode current = sortNode;
	            
	            while (current.next != null && current.next.info.getId() < newnode.info.getId())
	            {
	                current = current.next;
	            }
	            newnode.next = current.next;
	            current.next = newnode;
	        }
	    }
	       
	    public void sortedInsertNum(LLNode newnode)
	    {
	        
	        if (sortNode == null || sortNode.infoNum >= newnode.infoNum)
	        {
	            newnode.next = sortNode;
	            sortNode = newnode;
	        }
	        else
	        {
	            LLNode current = sortNode;
	            
	            while (current.next != null && current.next.infoNum < newnode.infoNum)
	            {
	                current = current.next;
	            }
	            newnode.next = current.next;
	            current.next = newnode;
	        }
	    }
	    
	    
	    public int getSize()
	    {
	    	
	        LLNode temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	        	
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	
}

