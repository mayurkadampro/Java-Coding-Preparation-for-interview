import java.util.StringTokenizer;

public class StringTokenizerClassExample
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("my name is khan"," "); //it remove spaces
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());  
		}  
    }  
} 