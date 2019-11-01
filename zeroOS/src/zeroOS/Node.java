package zeroOS;

public class Node {

	private Node next;
	private Object data;
	
	public Node(Node next, Object data) {
		
		this.next = next;
		this.data = data;
		
	}
	
	public Node( Object data) {
		
		this.data = data;
		this.next= null;
		
	}
	
	public void setNext(Node node)//setting new value for next node
	{	
        next = node;
    }

	public Node next() {
		return next;
	}

	   public void setValue(Object value)
	    {
	        data = value;
	    }

	public Object value() {
		// TODO Auto-generated method stub
		return data;
	}
	

}
