import java.util.Arrays;
class BubbleSort{
	public static void main(String args[]){
		int arr[] = sortByBubble(new int[]{6,5,4,3,2,1});
		System.out.println(Arrays.toString(arr));
	}
	static int[] sortByBubble(int arr[]){
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
/* output :- [1, 2, 3, 4, 5, 6] */