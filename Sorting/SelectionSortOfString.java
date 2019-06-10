import java.util.Arrays;
class SelectionSortOfString{
	public static void main(String args[]){
		String arr[] = sortElements(new String[]{"jhon","mikle","jenny","mighty","ghost"});
		System.out.println(Arrays.toString(arr));
	}
	
	public static String[] sortElements(String[] arr){
		int min = 0;
		String temp = "";
		for(int i=0;i<arr.length;i++){
			min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min].compareTo(arr[j]) > 0){
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
// [ghost, jenny, jhon, mighty, mikle]