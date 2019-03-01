import java.io.Console;
public class FreqOfCharacters
{
	public static void main(String ... args)
	{
		Console input = System.console();
		String str = input.readLine("Enter String : ");
		str = str.replace(" ","");
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		char stringalpha = 'a';
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j] == ch[i])
				{
					stringalpha = ch[j];
					count++;
				}
			}
			System.out.println(stringalpha+" : "+count);
			count = 0;
		}
	}
}