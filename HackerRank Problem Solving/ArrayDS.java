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