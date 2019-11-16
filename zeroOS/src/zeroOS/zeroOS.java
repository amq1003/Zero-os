package zeroOS;

import java.io.*;
import java.util.*;

public class zeroOS 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		LinkedList n=new LinkedList();
		
		
		n.insert(22);
		n.insert(7);
		n.insert(1);
		n.insert(16);
		n.insertAtStart(10);
		n.deleteAt(2);
		n.insertAt(3, 50);
		
		
		n.show();
		
		
		/*
		PCB thing= new PCB(0, 0, null);
		Scanner reader=new Scanner(new File("devices.txt"));
		while(reader.hasNext()) 
		{
			
			if(reader.hasNext("Location")) 
			{
				System.out.println(reader.nextLine());
			}
			else if(reader.hasNext("Name:"))
			{
				System.out.println(reader.nextLine());
			}
			else if(reader.hasNext("Access"))
			{
				System.out.println(reader.nextLine());
			}
			else if(reader.hasNext("Status:"))
			{
				reader.next();
				if(!reader.hasNext("Processing")) 
				{
					thing.setStatus(reader.next());
				}
			}
			else if(reader.hasNext("Processing"))
			{
				reader.next();
				reader.next();
				if(reader.hasNextBigInteger()) 
				{
					System.out.println(reader.next());
				}

				
			}
			
			reader.nextLine();
		}		
		reader.close();
		*/
	}
}
