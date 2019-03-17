import java.util.*;
public class ReverseStringByRecursion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter single string : ");
		String str = sc.nextLine();
		System.out.println(reverseString(str));
	}
	
	static String reverseString(String str)
	{
		if (str.isEmpty())
            return str;
		//Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}