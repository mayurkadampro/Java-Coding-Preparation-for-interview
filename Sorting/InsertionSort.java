import java.util.Arrays;
class InsertionSort{
	public static void main(String args[]){
		int arr[] = sortByInsertion(new int[]{6,5,4,3,2,1});
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] sortByInsertion(int arr[]){
		int j = 0;
		int temp = 0;
		for(int i=1;i<arr.length;i++){
			temp = arr[i];
			j=i;
			while( j>0 && temp<arr[j-1]){
				arr[j] = arr[j-1];
				j= j - 1;
			}
			arr[j] = temp;
		}
		return arr;
	}
}

/* output :- [1, 2, 3, 4, 5, 6] */