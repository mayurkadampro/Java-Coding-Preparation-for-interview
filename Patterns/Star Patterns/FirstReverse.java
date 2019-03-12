import java.io.Console;
class FirstReverse
{
	public static void main(String ... args)
	{
		Console input = System.console();
		int row = Integer.parseInt(input.readLine("Enter Row Number : "));
		pattern(row);
	}
	
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}