/*write a program to find the two number in the array of 20 
whose product(multiplication) is equal to given number by the user.
*/

import java.io.Console;
public class FindnumberFromArray
{
	public static void main(String args[])
	{
		Console input = System.console();
		int num = Integer.parseInt(input.readLine("Enter An Single Integer Number : "));
		boolean result = calProduct(new int[]{1,2,3,5,4,8,6,5,4,6,2,5,4,3,15,54,6,8,20,34},num);
		if(result)
		{
			System.out.println("There is no elements whose product is : "+num);
		}
	}
	
	public static boolean calProduct(int arr[] ,int num)
	{
		boolean find = true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]*arr[i+1] == num)
			{
				System.out.println(arr[i]+" * "+arr[i+1]+" =  "+arr[i]*arr[i+1]);
				find = false;
			}
		}
		
		return find;
	}
}