import java.util.Arrays;
public class BubbleSort
{
	public static void main(String args[])
	{
		int a[] = bubbleSort(new int[]{5,6,5,8,7,62,4,5,6,255,4,6,2,566,54,4,2,1});
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] bubbleSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{   
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
}