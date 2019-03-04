import java.io.Console;
public class FizzBuzzSoln
{
	public static void main(String args[])
	{
		Console input = System.console();
		String output = fizzBuzz(Integer.parseInt(input.readLine("Enter Single Integer : ")));
		System.out.println(output);
		output = fizzBuzz2(Integer.parseInt(input.readLine("Enter Single Integer : ")));
		System.out.println(output);
	}
	
	//First Solutions
	public static String fizzBuzz(int number) 
	{ 
		if (number % 3 == 0) 
		{ 	
			if (number % 5 == 0) 
			{ 
				return "fizzbuzz"; 
			}else 
			{ 
				return "fizz"; 
			}
		}else if (number % 5 == 0) 
		{ 
			return "buzz"; 
		} 
		return String.valueOf(number); 
	}
	
	//Second Solutions
	public static String fizzBuzz2(int number) 
	{ 
		if (number % 15 == 0) 
		{ 
			return "fizzbuzz";
		} else if (number % 5 == 0) 
		{ 
			return "buzz"; 
		} else if (number % 3 == 0) 
		{ 
			return "fizz"; 
		} 
		return String.valueOf(number); 
	}
	
}