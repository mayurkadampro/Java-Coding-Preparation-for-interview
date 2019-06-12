import java.util.Arrays;
class ArrayLeftShift{
	public static void main(String args[]){
		System.out.println(Arrays.toString(arrayLeft(new int[]{5,6,52,4,8,9})));
	}
	
	static int[] arrayLeft(int[] arr){
		int tempValue = arr[0];
		for(int i=1; i<arr.length;i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tempValue;
		return arr;
	}
}

// output :- [6, 52, 4, 8, 9, 5]