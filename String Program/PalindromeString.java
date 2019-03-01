import java.io.Console;
public class PalindromeString
{
	public static void main(String args[])
	{
		Console input = System.console();
		String str = input.readLine("Enter A String : ");
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		String result = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			result = result + ch[i];
		}
		
		
		if(result.equals(str))
		{
			System.out.println("It is palindrome String");
		}else
		{
			System.out.println("It is not a palindrome String");
		}
	}
}