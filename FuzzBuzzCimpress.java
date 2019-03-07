import java.io.Console;
import java.util.*;
public class FuzzBuzzCimpress
{
	public static void main(String args[])
	{
		Console input = System.console();
		int num = Integer.parseInt(input.readLine("Enter The Single Integer : "));
		String numOne = input.readLine();
		Scanner sc = new Scanner(numOne);
		
		while(sc.hasNext())
		{
			int value = Integer.parseInt(sc.next());
			for(int i=1;i<=value;i++)
			{
				if(i%15==0)
				{
					System.out.println("FuzzBuzz");
				}else if(i%3==0)
				{
					System.out.println("Fuzz");
				}else if(i%5==0)
				{
					System.out.println("Buzz");
				}else
				{
					System.out.println(i);
				}
			}
		}
	}
}