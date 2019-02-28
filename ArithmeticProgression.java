/*Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 
*/
import java.io.*;
class ArithmeticProgression
{
	public static void main(String args[])
	{
		Console input = System.console();
		int First = Integer.parseInt(input.readLine("Enter First Term : "));
		int Second = Integer.parseInt(input.readLine("Enter Second Term : "));
		int num = Integer.parseInt(input.readLine("Enter Nth Term : "));
		int result = calAP(First,Second,num);
		System.out.println(result);
	}
	
	public static int calAP(int first, int second,int num)
	{
		return first+(num-1)*(second - first);
	}
}