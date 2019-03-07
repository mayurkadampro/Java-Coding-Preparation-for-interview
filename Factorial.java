import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Single Number To Find Factorial : ");
		int num = sc.nextInt();
		num = calFactorial(num);
		System.out.println("Factorial is : "+num);
	}
	
	public static int calFactorial(int num)
	{
		int sum = 1;
		for(int i=1;i<=num;i++)
		{
			sum = sum * i;
		}
		return sum;
	}
}