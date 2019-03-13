import java.util.*;

public class MissingNumberSecond
{
	public static void main(String args[])
	{
		calMissingNumber(new int[]{1,2,3,5,7,8,10});
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
			}
			j++;
		}
	}
}