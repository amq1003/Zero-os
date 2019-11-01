package zeroOS;

public class PCB {
	private String Request;     	//name of device requested
	private String filename;    	//name of file to be used
	private int length;         	//length of file used
	private int processNumber;  	//number of the process
	private int cycles;         	//number of cycles process requires
	private int programCounter; 	//program counter
	private LinkedList subcommands; //list of commands used
	private String status;      	//status(waiting, ready..)
	private Node nextProcess;		//pointer to next process in the list
	
	public PCB(int cycles,int procount) 
	{
	    this.cycles=cycles;
	    this.programCounter=procount;
	    this.setStatus("zero , idle");
	}
	public PCB() {
		// TODO Auto-generated constructor stub
	}
	public int cyclesgetter() 
	{
		return this.cycles;
	}
	
	public int processgetter() 
	{
		return this.processNumber;
	}
	
 	public String printReady() 
	{
		return this.getStatus();
	}
	
	public Node printOnDeck()
	{
		return this.nextProcess;
	}
	
	public void printDevice() 
	{
		if(this.getStatus()=="running") 
		{
			System.out.println(this.cycles +" "+ this.filename + " " + this.length + " " + this.processNumber + " " + subcommands);
		}
		else
		{
			System.out.println("NO RUNNING PROCESS");
		}
	}
	
	public void printTerminal() 
	{
		if(this.getStatus()=="complete") 
		{
			System.out.println(this.cycles +" "+ this.filename + " " + this.length + " " + this.processNumber + " " + subcommands);
		}
		else
		{
			System.out.println("NO COMPLETE PROCESSES");
		}
	}
	
	public void printIncomplete()
	{
		if(this.getStatus()=="waiting") 
		{
			System.out.println(this.cycles +" "+ this.filename + " " + this.length + " " + this.processNumber + " " + subcommands);
		}
		else if(this.getStatus()=="ready") 
		{
			System.out.println(this.cycles +" "+ this.filename + " " + this.length + " " + this.processNumber + " " + subcommands);
		}
		else
		{
			System.out.println("NO READY OR WAITING PROCESSES");
		}
	}
	public String getStatus() {
		return status;
	}
	public String setStatus(String status) {
		this.status = status;
		return status;
	}
}
