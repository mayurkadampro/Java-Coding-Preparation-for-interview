import java.util.Arrays;
class ArrayLeftShiftByReq{
	public static void main(String args[]){
		System.out.println(Arrays.toString(arrayLeft(new int[]{5,6,52,4,8,9},4)));
	}
	
	static int[] arrayLeft(int[] arr,int k){
		for(int count=1;count<=k;count++){
			int tempValue = arr[0];
			for(int i=1; i<arr.length;i++){
				arr[i-1] = arr[i];
			}
			arr[arr.length-1] = tempValue;
		}
		return arr;
	}
}

// output :- [8, 9, 5, 6, 52, 4]