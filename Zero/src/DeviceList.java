import java.util.*;
import java.util.LinkedList;

public class DeviceList extends Device {
	
	LinkedList<Device> DeviceList1;
	
	Device devicePtr;
	
	DeviceList() {
		DeviceList1 = new LinkedList<Device>();
		devicePtr = null;	//pointer to the first device in the list
	}
	public void RemoveDeviceList(){		//should check the status of the device processes before removing the list
		int size = DeviceList1.size();
		for (int i = 0; i < size; i++) {
			DeviceList1.remove(i);
		}
	}
	public void AddDevice(Device newDevice) {	//adds a device to the beginning of Device List
		DeviceList1.addFirst(newDevice);
		devicePtr = DeviceList1.getFirst();
		
	}
	public void printDevices() {		//prints contents of the device linked list through Device printDevice
		for (int i = 0; i < DeviceList1.size(); i++) {
			super.printDevice(DeviceList1.get(i));
		}
		
	}
	public void addProcess(Device newDevice) {
		// need code from process group to get PCB
		//newDevice.super.getProcess();  	//get the process to obtain the information to add to device queue
		//super.deviceQueue.push(newPro)
	}
	public void decrementDevices() {
		
	}
	public void checkStatus() {
		// If process is complete, advance the jobs.
	}
}