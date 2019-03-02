/* https://www.hackerrank.com/challenges/kangaroo/problem
*/

//solution one
static String kangaroo(int x1, int v1, int x2, int v2) {
	if (v1 > v2) {
        if ((x1 - x2) % (v2 - v1) == 0) {
            return "YES";
        }
    }
    return "NO";
}

//solution second
static String kangaroo(int x1, int v1, int x2, int v2) {
    int firstCong = v1 - x1;
    firstCong = Math.abs(firstCong);
    int secondCong = v2 - x2;
    secondCong = Math.abs(secondCong);
    for (int i = 0; i <= firstCong+secondCong; i++) {
        x1+=v1;
        x2+=v2;
        if(x1==x2){
            return "YES";
        }
    }
    return "NO";
}
