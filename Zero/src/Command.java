import java.util.LinkedList;

public class Command {
	LinkedList<String> CommandNode;
	public String request;
	public double length;
	public Command nextCommand;
	Command classptr;
	Command currentptr;
	Command head;
			
		Command()
		{
			classptr = null;
			currentptr = null;
		}
			
		public void clearCommand()
		{
			head = null;
		}
			
		public void addEntry(String request, int length)
		{
			this.request = request;
			this.length = length;
		}
			
		public int SendLength(int length)
		{
			return length;
		}
			
		public void print()
		{
			Command commands = head;
			while(commands != null)
			{
				commands.print();
				System.out.println("Next Node works: " + commands.nextCommand);
				commands = commands.nextCommand;
				System.out.println();
			}
		}
	}