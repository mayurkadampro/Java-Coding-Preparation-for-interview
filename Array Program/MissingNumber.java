public class MissingNumber
{
	public static void main(String[] args)
	{
		System.out.println("Missing number from array arr1: "+missingNumber(new int[]{7,5,6,1,4,2}));
		System.out.println("Missing number from array arr2: "+missingNumber(new int[]{5,3,1,2}));
	}
	
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for(int i : arr)
		{
			restSum+=i;
		} 
		return sum-restSum;
	}
	
}