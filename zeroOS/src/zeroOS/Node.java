package zeroOS;

public class Node {
	private Node next;
	private Object data;
	public Node getNext() 
	{
		return next;
	}
	public void setNext(Node next) 
	{
		this.next = next;
	}
	public Object getData() 
	{
		return data;
	}
	public void setData(Object data) 
	{
		this.data = data;
	}
}