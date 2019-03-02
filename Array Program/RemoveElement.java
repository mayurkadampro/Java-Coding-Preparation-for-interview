import java.util.Arrays;
public class RemoveElement
{
	public static void main(String args[])
	{
		deleteElement(new int[]{12,34,54,98,35},54);
		
	}
	
	public static void deleteElement(int arr[],int num)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				for(int j=i; j<(arr.length-1); j++)
				{
					arr[j] = arr[j+1];
				}
				count++;
				break;
			}
		}
		
		if(count==0)
        {
			System.out.print("Element Not Found..!!");
        }
       else
       {
           System.out.print("Element Deleted Successfully..!!");
           System.out.print("\nNow the New Array is :\n");
		   for(int i=0; i<(arr.length-1); i++)
           {
               System.out.print(arr[i]+ " ");
           }
       }
	
	}
}