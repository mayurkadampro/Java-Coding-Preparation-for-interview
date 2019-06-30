/* A majority element in an array A[] of size n is an element that appears 
more than n/2 times (and hence there is at most one such element). */
import java.util.*;
class FindMajorityElements{
	public static void main(String args[]){
		Object Output = calMajorityElements(new int[]{1, 2, 3, 4, 5, 6, 8, 8, 8, 9, 8, 8, 8, 8, 8});
		System.out.println("Output : "+Output);
	}
	
	static Object calMajorityElements(int arr[]){
		Integer result = null;
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		
		int val = arr.length/2;
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			if(entry.getValue() > val){
				result = entry.getKey();
				break;
			}
		}
		if(result == null)
			return "No Majority element";
		else
			return result;
	}
}

/*
Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4 

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element

Input : {1, 2, 3, 4, 5, 6, 8, 8, 8, 9, 8, 8, 8, 8, 8}
Output : 4
*/