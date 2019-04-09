/* https://www.hackerrank.com/challenges/beautiful-binary-string/problem */

static int beautifulBinaryString(String B) {
	return B.length() - B.replace("010","01").length();  
}