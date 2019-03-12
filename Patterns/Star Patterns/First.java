import java.io.Console;
class First
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
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}