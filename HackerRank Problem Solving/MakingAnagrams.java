/*https://www.hackerrank.com/challenges/making-anagrams/problem
*/

    // Complete the makingAnagrams function below.
static int makingAnagrams(String s1, String s2) {
	int cArr[]=new int[26];
    for(int i=0;i<s1.length();i++)cArr[s1.charAt(i)-97]++;
    for(int i=0;i<s2.length();i++)cArr[s2.charAt(i)-97]--;
    int count=0;
    for(int i=0;i<26;i++)count+=Math.abs(cArr[i]);
    return count++;
}