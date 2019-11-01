package zeroOS;

public class DeviceFile {
	
	private int[] logicalName=new int[5];
	private int[] physicalName=new int[5];
	
	
	DeviceFile()
	{
		
	}

	public int[] getLogicalName() {
		return logicalName;
	}

	public void setLogicalName(int[] logicalName) {
		this.logicalName = logicalName;
	}
	
}
