// example Hello World -->  olleh dlrow
import java.util.Scanner;
public class ReverseWordOfString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		calReverse(str);
	}
	
	public static void calReverse(String str)
	{
		String ch[] = str.split(" ");

		
		for(int i=0;i<ch.length;i++)
		{
			char chh[] = ch[i].toCharArray();
			for(int j=chh.length-1;j>=0;j--)
			{
				System.out.print(chh[j]);
			}
			System.out.print(" ");
		}
	}
}