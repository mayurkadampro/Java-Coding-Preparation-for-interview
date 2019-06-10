import java.util.Arrays;
class BinarySearch{
	public static void main(String args[]){
		int index = binarySearch(new int[]{9,5,8,6,4,3,2,1,11},11);
		if(index>=0){
			System.out.println("Element at index : "+index);
		}else{
			System.out.println("Element not found.");
		}
	}
	static int binarySearch(int[] arr,int searchElement){
		Arrays.sort(arr); // for binarySearch search sorted array is require.
		int start = 0;
		int last = arr.length-1;
		int mid = arr.length/2;		
		while(start <= last){
			if(searchElement == arr[mid]){
				return mid;
			}else if(arr[mid] < searchElement){
				start = mid+1;
			}else{ 
				last = mid-1; 
			}
			mid = (start+last)/2;
		}
		return -1;
	}
}