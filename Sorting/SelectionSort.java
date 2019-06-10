import java.util.Arrays;
class SelectionSort{
	public static void main(String args[]){
		int arr[] = sortElements(new int[]{9,5,6,2,3,55,2,7,1,25,5});
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] sortElements(int[] arr){
		int min = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min = j;
				}
			}
			// swapping of elements
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
 		}
		return arr;
	}
}

// Actual Output
// [1, 2, 2, 3, 5, 5, 6, 7, 9, 25, 55]