import java.util.Scanner;
public class CapsFirstLetter
{
	public static void main(String ... args)
	{
		String str = "welcMe to The heaven";
		System.out.println("Normal String");
		System.out.println(str+"\n");
		Scanner sc = new Scanner(str);
		System.out.println("After Operations");
		while(sc.hasNext())
		{
			String value = sc.next();
			System.out.print(Character.toUpperCase(value.charAt(0))+""+value.substring(1,value.length())+" ");
		}
		System.out.println();
		
		
		
		
		
	}
}