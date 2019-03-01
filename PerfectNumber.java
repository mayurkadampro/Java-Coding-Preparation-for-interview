import java.io.Console;
class PerfectNumber
{
	public static void main(String args[])
	{
		Console input = System.console();
		int num = Integer.parseInt(input.readLine("Enter Single Int Value : "));
		if(checkPerfectNumber(num))
		{
			System.out.println("It is Perfect Number");
		}else
		{
			System.out.println("It is Not Perfect Number");
		}
		
	}
	
	public static boolean checkPerfectNumber(int num)
	{
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if(num % i == 0)
				sum += i;
		}
		if(sum == num)
			return true;
		
		return false;
	}
}