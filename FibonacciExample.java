import java.io.Console;
public class FibonacciExample
{
	public static void main(String args[])
	{
		Console input = System.console();
		int num = Integer.parseInt(input.readLine("Enter Any Number  : "));
		int a = 0;
		int b = 1;
		System.out.println(a+"\n"+b);
		for(int i=0; i<num; i++)
		{
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}