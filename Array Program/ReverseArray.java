// sort array without using any extra space
class ReverseArray{
	public static void main(String args[]){
		int arr[] = {9,8,7,6,5,4,3,2,1};
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			start += 1;
			end -= 1;
		}
		for(int i: arr){
			System.out.print(i);
		}
	}
}