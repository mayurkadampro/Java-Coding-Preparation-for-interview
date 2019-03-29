/* https://www.hackerrank.com/challenges/arrays-ds/problem
*/

static int[] reverseArray(int[] a) {
	int arr[] = new int[a.length];
	int b = 0;
	for (int i = a.length - 1; i >= 0; i--) {
		System.out.print(a[i] + " ");
		arr[b] = a[i];
		b++;
	}
	return arr;
}


// alternative way to print reverse array
static int[] reverseArray(int[] a, int start, int end) {
	int temp; 
        if (start >= end) 
            return a;
        temp = a[start]; 
        a[start] = a[end]; 
        a[end] = temp; 
        return reverseArray(a,start+1,end-1); // call in main by reverseArray(arr,0,arr.length-1)
}