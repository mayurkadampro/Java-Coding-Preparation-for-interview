import java.util.Scanner;
public class SumOfNaturalNumbers
{
	public static void main(String ... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Single Integer Value");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum += i;
		}
		System.out.print("Sum is : "+sum);
	}
}