/* wajp to find first string in sentence and print it reverse matchine in that sentence and also each sentence end with $ sign and if no matching reverse string is found then print $*/

import java.util.*;
import java.io.*;
class MatchReverse{
	public static void main(String[] args)throws Exception {
		Console input = System.console();
		// sample "this is the siht$";
		String a = input.readLine("Enter A Sentence which ends with $ : ");
		System.out.println(findMatch(a));
	}
	
	static String findMatch(String a)
	{
		Scanner sc = new Scanner(a.toLowerCase());
		StringBuilder sb = new StringBuilder(sc.next());
		sb.reverse();
		while(sc.hasNext())
		{
			String c = sc.next().replace("$","");
			if(c.equals(sb.toString()))
			{
				return c;
			}
		}
		
		return "$";
	}
}