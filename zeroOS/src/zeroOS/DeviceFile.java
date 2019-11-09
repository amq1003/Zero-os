package zeroOS;

public class DeviceFile {
	
	private String[] logicalName = new String[] {"hard disk 1", "hard disk 2", "hard disk 3", "hard disk 4", "hard disk 5"};
	private String[] physicalName = new String[] {"A", "B", "C", "D", "E"};
	private String status;
	private int speed;
	
	DeviceFile()
	{
		this.status="idle";
	}
	
	public void setStatus(String status) 
	{
		this.status = status;	
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setSpeed(int speed)
	{	
		this.speed = speed;	
	}
	
	public int getSpeed()
	{
		return speed;	
	}

	public void setLogicalName(String[] logicalName) 
	{
		this.logicalName = logicalName;
	}
	
	public String[] getLogicalName() 
	{
		return logicalName;
	}

	public void setPhysicalName(String[] physicalName) 
	{
		this.physicalName = logicalName;
	}
	
	public String[] getPhysicalName() 
	{
		return physicalName;
	}
	
}
