import java.util.Scanner;
class TokenizingStringData
{
	public static void main(String args[])
	{
		String data = "a,2,b,3,c,7"; // output - aabbbccccccc
		String p;
		int a;
		Scanner sc = new Scanner(data);
		sc.useDelimiter(",");
	
		while(sc.hasNext())
		{
			p = sc.next();
			a = sc.nextInt();
			for(int i=1;i<=a;i++)
			{
				System.out.print(p);
			}
			
		}
		
		
	}
}