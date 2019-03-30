import java.util.Arrays;
class ReverseArrayInPlace{
	public static void main(String args[]){
		System.out.println(Arrays.toString(calLeapYear(new int[]{5,1,2,6,4,10})));
		System.out.println(Arrays.toString(calLeapYear(new int[]{5,1})));
		System.out.println(Arrays.toString(calLeapYear(new int[]{5})));
	}
	
	static int[] calLeapYear(int[] arr){
		if(arr == null || arr.length < 1){
			return arr;
		}
		
		for(int i=0;i<arr.length/2;i++){
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i ];
			arr[arr.length - 1 - i ] = temp;
		}
		
		return arr;
	}
}