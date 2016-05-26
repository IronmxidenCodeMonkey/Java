
public class Compass {
	public static void main(String[] args)
	{
	int directions = 1;
	if (args[0].length() > 0)
	{
		if (args[0] ==  "1")
		{
			directions = 1;
		}
		if (args[0] == "2")
		{
			directions = 2;
		}
		if (args[0] ==  "3")
		{
			directions = 3;
		 }
		if (args[0] ==  "4")
		{
			directions = 4;
		 }	
		switch (directions)
		{
			case 1: System.out.println("You are travelling north.");
			case 2: System.out.println("You are travelling east."); 
			case 3: System.out.println("You are travelling south.");
			case 4: System.out.println("You are travelling west.");
			default: System.out.println("You are lost.");	
		
	}	
	
	
		}
	}
}
