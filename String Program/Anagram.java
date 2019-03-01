import java.util.*;
public class Anagram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str = sc.nextLine();
		System.out.println("Enter Second String");
		String strr = sc.nextLine();
		if(checkAnagram(str,strr))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
	
	public static boolean checkAnagram(String str,String strr)
	{
		if(str.length() == strr.length())
		{
			char[] ArrayS1 = str.toLowerCase().toCharArray();  
            char[] ArrayS2 = strr.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            boolean status = Arrays.equals(ArrayS1, ArrayS2);
			return status;
		}
		return false;
	}
}