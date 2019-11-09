package zeroOS;

public class CPU {
	private String status; 		// the status of the CPU (waiting, ready...)
	private int sendingProc;	// process number of the process that sent the request
	private int cycles;			// number of cycles total
	private int cyclesLeft; 	// number of cycles left before the process is done with CPU
	private long startTime; 	// the time that the job came into the CPU
	PCB stuff=new PCB(cycles, cyclesLeft);
	
	public CPU()
	{
		this.status="idle";
	}
	
	public void setJob(String stat)
	{
		this.status=stat;
		stuff.setStatus(status);
		this.sendingProc=stuff.processgetter();
		this.cycles=stuff.cyclesgetter();
		this.cyclesLeft=stuff.cyclesgetter();
		this.startTime=System.currentTimeMillis();
		
	}
	
	public boolean advanceJob() 
	{
		if (status == "idle" ) 
		{
			return false;	
		}
		else 
		{
			cyclesLeft--;
			return true;
		}
	}
}
