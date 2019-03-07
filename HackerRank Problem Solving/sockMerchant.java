/* https://www.hackerrank.com/challenges/sock-merchant/problem
*/

// Complete the sockMerchant function below.
static int sockMerchant(int n, int[] ar) {
    HashSet<Integer> set = new HashSet<Integer>();
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (set.contains(ar[i])) {
            set.remove(ar[i]);
            count++;
        } else {
            set.add(ar[i]);
        }
    }
    return count;
}
