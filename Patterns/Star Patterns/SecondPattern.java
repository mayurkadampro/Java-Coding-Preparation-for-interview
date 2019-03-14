import java.util.Scanner;
class SecondPattern
{
	public static void main(String args[])
	{
		System.out.print("Enter Any Number : ");
		int num = new Scanner(System.in).nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}