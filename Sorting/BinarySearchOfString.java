import java.util.Arrays;
class BinarySearchOfString{
	public static void main(String args[]){
		int index = binarySearch(new String[]{"Hello","Hii","Mighty","Ghost","hack"},"Yo");
		if(index>=0)
			System.out.println("Element at index : "+index);
		else
			System.out.println("Element not found.");
	}
	static int binarySearch(String[] arr,String searchElement){
		/* for binarySearch search sorted array is require.
		without sorted elements output is unpredictable */
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Search Element is "+searchElement);
		int start = 0;
		int last = arr.length-1;
		int mid = arr.length/2;		
		while(start <= last){
			if(searchElement.equals(arr[mid])){
				return mid;
			}else if(arr[mid].compareTo(searchElement) < 0){
				start = mid+1;
			}else{ 
				last = mid-1; 
			}
			mid = (start+last)/2;
		}
		return -1;
	}
}

/*
[Ghost, Hello, Hii, Mighty, hack]
Search Element is hack
Element at index : 4

[Ghost, Hello, Hii, Mighty, hack]
Search Element is Hii
Element at index : 2

[Ghost, Hello, Hii, Mighty, hack]
Search Element is Yo
Element not found.

*/