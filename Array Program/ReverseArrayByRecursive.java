/*
Iterative way :
1) Initialize start and end indexes as start = 0, end = n-1
2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
start = start +1, end = end – 1
*/

import java.util.*;
class ReverseArrayByRecursive{
	public static void main(String args[]){
		int a[] = new int[]{15,46,89,24,21,5,1};
		int arr[] = rvereseArray(a,0,a.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] rvereseArray(int arr[],int start, int end){
		int temp; 
        if (start >= end) 
            return arr; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        return rvereseArray(arr, start+1, end-1); 				
	}
}