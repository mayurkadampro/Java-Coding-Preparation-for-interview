import java.io.Console;
public class ReverseByRecursion
{
	
	public static void main(String args[])
	{
		Console input = System.console();
		String str = input.readLine("Enter A String : ");
		String temp = calReverseByRecusion(str);
		System.out.println("Reverse String is : "+temp);
	}
	
	public static String calReverseByRecusion(String str)
	{
		if(){}
		
		char temp = "".join(calReverseByRecusion(str.charAt(str.length()-1)));
		return "";
	}
}