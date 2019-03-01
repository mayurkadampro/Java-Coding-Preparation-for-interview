import java.io.Console;
public class CountVowel
{
	public static void main(String args[])
	{
		Console input = System.console();
		String str = input.readLine("Enter a String : ");
		str = str.toLowerCase();
		char c[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
				count++;
		}
		System.out.println("Total number of vowels are : "+count);
	}
}