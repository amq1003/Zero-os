public class PCB {

	private String Request;     /*name of device requested*/
	private String filename;    /*name of file to be used*/
	private int length;         /*length of file used*/
	private int processNumber;  /*number of the process*/
	private int cycles;         /*number of cycles process requires*/
	private int programCounter; /*program counter*/
	String[] subcommands;       /*list of commands used*/
	private String status;      /*status(waiting, ready..)*/
	/*   *nextProcess,  pointer to next process in the list*/
	
	public PCB() {
	    
	    
	
	}
}	