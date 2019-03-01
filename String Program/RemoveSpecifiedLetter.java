import java.io.Console;
public class RemoveSpecifiedLetter
{
	public static void main(String args[])
	{
		Console input = System.console();
		String str = input.readLine("Enter a String : ");
		str = str.toLowerCase();
		String c = input.readLine("Enter a Single Character to remove from String : ");
		char ch = c.charAt(0);
		System.out.println(str+" : "+ch);
		char chh[] = str.toCharArray();
		String joint = "";
		
		for(char temp : chh)
		{
			if(temp != ch)
			{
				joint = joint + temp;
				System.out.print(temp);
			}
			
		}
		
		

		
	}
}