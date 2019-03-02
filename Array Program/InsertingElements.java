import java.util.Arrays;
public class InsertingElements
{
	public static void main(String args[])
	{
		int a[] = insertElements(new int[]{5,6,5,8,76,54,4,2,1},10,3);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] insertElements(int []arr,int num,int position)
	{
		 for(int i = arr.length-1; i > position-1; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[position-1] = num;

		return arr;
	}
}