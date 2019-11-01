package zeroOS;

public class LinkedList { 
	  
    Node head; // head of list 
    Node tail;	//end of the list
    private int size = 0; //the size of the list
    
    public LinkedList (Node head, Node tail, int size){
    	
    	this.head = head;
    	this.tail = tail;	//initializing
    	this.size = size;
    	
    }
    
    public void addNode(String data) {	//adding a new node to linked list
        if (head == null) {				//check if head is null, means list is empty		
        	head = new Node(null, null, data);	//make new head node if true, next = null, prev = null, insert data
    		size++;		//increment size
        } else {	//meaning list is not empty
        	head = new Node(null, head, data); //new head node next = null, prev = head, insert data
    		size++;
        }
    }

    
}

