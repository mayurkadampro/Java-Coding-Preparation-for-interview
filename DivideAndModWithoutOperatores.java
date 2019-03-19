import java.io.*;
class DivideAndModWithoutOperatores
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entered First Value : ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Entered First Value : ");
		int y = Integer.parseInt(br.readLine());
		int arr[] = calDivideAndMod(x,y);
		System.out.println("quotient  is : "+arr[1]+" Reminder is : "+arr[0]);
	}
	
	public static int[] calDivideAndMod(int x, int y)
	{
		int arr[] = new int[2];
		int count=0;
		while(x>=y)
		{
			x=x-y;
			count++;
		}
		arr[0] = x;
		arr[1] = count;
		return arr;
	}
}