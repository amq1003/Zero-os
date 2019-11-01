package zeroOS;

public class LinkedList { 
	  
    Node head; // head of list
    private int size = 0; //the size of the list
    private int count=0;
    
    public LinkedList (Node head,  int size){
    	
    	this.head = head;
    	this.size = size;
    	
    }
    
    public void addNode(Node data) //adding a new node to linked list
    {	
    	Node temp = new Node(data,null),finger = head;
    	if (head == null) {
    		head = temp;
    		count++;
    	}
    	else {
    		while (finger.next()!=null) {
    			finger = finger.next();
    		}
    		finger.setNext(temp);
    		count++;
    	}
    }

    
    public Object removeLast()
    {
    	Node finger = head,prev = finger;
    	if (finger==null) {
    		return null;
    	}
    	else if (finger.next() == null) {
    		head = null;
    		count--;
    		return prev.value();
    	}
    	else {
    		while (finger.next() != null) {
    			prev = finger;
    			finger = finger.next();
    		}
    		prev.setNext(null);
    		count--;
    		return finger.value();
    	}
    }
    
    
}

