/*https://www.hackerrank.com/challenges/two-strings/problem
*/

static String twoStrings(String s1, String s2) {
	if(Pattern.compile("["+s2+"]").matcher(s1).find())
              return "YES";
          else 
             return "NO";
}