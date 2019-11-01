package zeroOS;

public class CPU {
	private String status; // the status of the CPU (waiting, ready...)
	private int sendingProc; // process number of the process that sent the request
	private int cyclesLeft; // number of cycles left before the process is done with CPU
	private long startTime; // the time that the job came into the CPU
	PCB stuff=new PCB();
	
	public CPU()
	{
		this.status="idle";
	}
	
	public void setJob(String stat)
	{
		this.status=stat;
		this.sendingProc=stuff.processgetter();
		this.cyclesLeft=stuff.cyclesgetter();
		this.startTime=System.currentTimeMillis();
		
	}
	
	public boolean advanceJob() 
	{
		if (status == "idle" ) {
			return false;	
		}
		else {
			cyclesLeft--;
			return true;
		}
	}
}
