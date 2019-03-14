import java.util.*;

public class MissingNumberSecond
{
	public static void main(String args[])
	{
		calMissingNumber(new int[]{1,3,6,9});
	}
	
	static void calMissingNumber(int arr[])
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[j])
			{
				System.out.println("Missing Number is :"+i);
				j--;
				System.out.println("Decrement j is : "+j);
			}
			j++;
			System.out.println("incecrement j is : "+j);
		}
	}
}