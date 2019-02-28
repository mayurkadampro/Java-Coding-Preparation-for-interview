import java.io.Console;
public class ArmstrongNumber
{
	public static void main(String ... args)
	{
		Console input = System.console();
		int num = Integer.parseInt(input.readLine("Enter Any Integer Value : "));
		int temp = num;
		int digit, sum = 0;
		while(temp!=0)
		{
			digit = temp%10;
			sum = sum + (int)Math.pow(digit,3);
			temp /= 10;
		}
		
		if(sum == num)
	            System.out.println(num + " is an Armstrong Number");
	        else
	            System.out.println(num + " is not an Armstrong Number");
	}
}