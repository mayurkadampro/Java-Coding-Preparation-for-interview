/* Java Substring Comparisons - https://www.hackerrank.com/challenges/java-string-compare/problem
*/
import java.io.*;
public class SubstringComparison
{
	public static void main(String args[])
	{
		Console input = System.console();
		String str = input.readLine("Enter String : ");
		int k = Integer.parseInt(input.readLine("Enter Single Integer Value : "));
		subStringComp(str,k);
	}
	
	public static void subStringComp(String str, int k)
	{
		String small = "";
		String large = "";
		small = large = str.substring(0, k);
		
		for(int i=0;i<str.length()-k+1;i++)
		{
			String sub = str.substring(i,i+k);
			if(small.compareTo(sub) > 0)
				small = sub;
			if(large.compareTo(sub) < 0)
				large = sub;
		}
		
		System.out.println("Smallest SubString : "+small+" & Largest SubString : "+large);
		
	}
}