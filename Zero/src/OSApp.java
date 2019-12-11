
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class OSApp {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException {
		Scanner devices = new Scanner(new File("devices.txt"));
		Scanner process = new Scanner(new File("Process.txt"));
		Device deviceNode = new Device();
		DeviceList listDevices = new DeviceList();
		String Location=null,Name=null,Access=null,Status=null;
		int Speed=0;
		System.out.println("READING FILE:");
		while (devices.hasNextLine()) {
			
			if(devices.hasNext("Location")) 
			{
				devices.next();
				Location=devices.next();
				//Location=Location;
				Location = Location.substring(0, Location.length() - 1);
			}
			else if(devices.hasNext("Name:"))
			{
				devices.next();
				//System.out.println("IN NAME");
				//System.out.println(devices.next());
				Name=devices.next()+devices.next();
			}
			else if(devices.hasNext("Access"))
			{
				devices.next();
				devices.next();
				Access=devices.next();
			}
			else if(devices.hasNext("Status:"))
			{
				devices.next();
				if(!devices.hasNext("Processing")) 
				{
					Status=devices.next();
				}
			}
			else if(devices.hasNext("Processing"))
			{
				devices.next();
				devices.next();
				if(devices.hasNextBigInteger()) 
				{
					Speed=devices.nextInt();
				}

				
			}
			System.out.println(Location);
			System.out.println(Name);
			System.out.println(Access);
			System.out.println(Status);
			System.out.println(Speed);
			devices.nextLine();
			
			
			
			deviceNode.initialize("Name", "Access", Speed);
			listDevices.AddDevice(deviceNode);
			
			//deviceNode.initialize("USB12.0", "A2231001./23", 13);
			//listDevices.AddDevice(deviceNode);
			//deviceNode.initialize("USB8.0", "AAE:10dd23", 14);
			//listDevices.AddDevice(deviceNode);
			
			
			
		}
		listDevices.printDevices();
		
	}

}
