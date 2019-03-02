/*https://www.hackerrank.com/challenges/sherlock-and-array/problem
*/
static String balancedSums(List<Integer> arr) {
    int LeftSum = 0;
    int sum = 0;
    for (int a : arr) {
        sum += a;
    }

    for (int RightSum : arr) {
        if (2 * LeftSum == sum - RightSum) {
            return "YES";
        }
        LeftSum += RightSum;
    }
    return "NO";
}