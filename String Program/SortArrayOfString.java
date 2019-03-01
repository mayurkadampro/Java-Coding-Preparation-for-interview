import java.util.*;
class SortArrayOfString
{
	public static void main(String ... args)
	{
		sortArrayString(new String[]{"Mighty","Ghost","Hack","Dexter","Flash"});
	}
	
	public static void sortArrayString(String[] arr)
	{
		String temp = "";
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if((arr[j].compareTo(arr[j+1]) > 0))
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}