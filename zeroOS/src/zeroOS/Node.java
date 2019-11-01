package zeroOS;

public class Node {

	private Node next;
	private Node prev;
	private String data;
	
	public Node(Node next, Node prev, String data) {
		
		this.next = next;
		this.prev = prev;	//initializing
		this.data = data;
		
	}
	
	public void setNext(Node node){	//setting new value for next node
        next = node;
    }
    public void setPrev(Node node){	//setting new value for previous node
        prev = node;
    }
}
