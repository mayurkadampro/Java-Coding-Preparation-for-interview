import java.util.*;
class BinarySearch{
	public static void main(String args[]){
		BinarySearch bs = new BinarySearch();
		bs.calBinarySearch(new int[]{1,5,8,9,18,19,25,65},19);
	}
	
	void calBinarySearch(int[] arr,int search){
		int start = 0;
		int last = arr.length - 1;
		int middle = (start+last) / 2;
		
		
	while(start<=last)
	{
		if(arr[middle] == search){
			System.out.println("Elements found at "+middle+" index");
			break;
		}else if(arr[middle]<search){
			start = middle+1;
		}else{
			last = middle-1;
		}
		middle = (start+last)/2;
	}
	if(start > last)
		System.out.println("Element not Found");
	
	}
}