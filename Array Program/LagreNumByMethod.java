import java.util.*;
public class LagreNumByMethod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		calThreeLagreNum(new int[]{2,6,98,35,4,3,6,5,85,36,542,325,32,54},num);
	}
	public static void calThreeLagreNum(int arr[],int num)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[num];
		System.arraycopy(arr, arr.length-num, arr2, 0, num);
		System.out.println(Arrays.toString(arr2));
	}
}