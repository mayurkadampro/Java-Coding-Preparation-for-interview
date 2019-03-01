import java.util.Scanner;
class TokenizingStringData1
{
	public static void main(String args[])
	{
		String data = "a2b3c7"; // output - aabbbccccccc
		char p;
		int a;
		int count = 0;
		for(int i=0; i<data.length();i++)
		{
			p = data.charAt(i);
			a = Character.getNumericValue(data.charAt(i+1));
			i++;
			for(int j=0;j<a;j++)
			{
				System.out.print(p);
			}
		}
}
}