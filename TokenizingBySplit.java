public class TokenizingBySplit {
 
	public static void main(String[] args)
	{
		String splitString = "one,two,,three,four,,five";
		
		String[] tokens = splitString.split(",");
		
		for (int j = 0; j < tokens.length; j++)
		{
			System.out.println("Split Output: "+ tokens[j]);
		}
	}
}