import java.io.*;
public class SwapString
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strr = br.readLine();
		System.out.println("After Swapping");
		
		str = str+strr;
		strr = str.substring(0,str.length()-strr.length());
		str = str.substring(strr.length());
		System.out.println(str+"\n"+strr);
		
	}
}