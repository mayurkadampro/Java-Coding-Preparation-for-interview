import java.util.Arrays;
class ArrayRightShift{
	public static void main(String args[]){
		System.out.println(Arrays.toString(arrayRight(new int[]{5,6,52,4,8,9})));
	}
	
	static int[] arrayRight(int[] arr){
		int tempValue = arr[arr.length - 1];
		for(int i=arr.length-2; i>-1;i--){
			arr[i+1] = arr[i];
		}
		arr[0] = tempValue;
		return arr;
	}
}

// output :- [9, 5, 6, 52, 4, 8]