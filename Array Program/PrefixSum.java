import java.util.Arrays;
class PrefixSum{
	public static void main(String args[]){
		int arr[] = {-8};
		
		// traditional approch
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			maxSum = Math.max(sum,maxSum);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is : "+sum);
		System.out.println("maxSum is : "+maxSum+"\n");
		
		// now find in between 2 to 6 by traditional approch
		/*
		sum = 0;
		maxSum = 0;
		for(int i=2;i<7;i++){
			sum = sum + arr[i];
			maxSum = Math.max(sum,maxSum);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is : "+sum);
		System.out.println("maxSum is : "+maxSum+"\n");
		
		// now try this by prefix sum algorithm
		
		maxSum = 0;
		for(int i=1;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i];
			maxSum = Math.max(sum,maxSum);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("maxSum is : "+maxSum+"\n");
		
		// now find in between 2 to 6 by prefix sum algorithm
		// simple perform operation on array
		// no need to use any extra for loop and no need to repeat same iteration over again.
		System.out.println(arr[6]-arr[1]); 
		*/
	
	}
} 