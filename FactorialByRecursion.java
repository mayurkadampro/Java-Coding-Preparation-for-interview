import java.util.Scanner;

public class FactorialByRecursion
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
		if(num==1)
		{
			return 1;
		}
		return num * calFactorial(num-1);
	}
}