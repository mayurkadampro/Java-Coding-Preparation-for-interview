import java.util.Arrays;
class QuickSort{
	public static void main(String args[]){
		int[] arr = {9,5,0,3,2,1,6,5};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static int partition(int[] arr,int start,int end){

		int mpivot = (start+end)/2;

		while(start <= end){
			while(arr[start] < arr[mpivot]){
				start++;
			}
			while(arr[end] > arr[mpivot]){
				end--;
			}
			if(start <= end){
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	static void quickSort(int[] arr,int start,int end){

		int pivot = partition(arr,start,end);

		if(start < pivot-1){
			quickSort(arr,start,pivot-1);
		}
		if(pivot < end){
			quickSort(arr,pivot,end);
		}

	}
}

// output :- [0, 1, 2, 3, 5, 5, 6, 9]