import java.util.*;
class SortString
{
	public static void main(String ... args)
	{
		String s = sortString(new String("Mayur"));
		System.out.println(s);
	}
	
	    // Method to sort a string alphabetically 
    public static String sortString(String inputString) 
    { 
		inputString = inputString.toLowerCase(); 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    }
}