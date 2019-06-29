/* Given two strings str1 and str2, find if str1 is a subsequence of str2. 
A subsequence is a sequence that can be derived from another sequence 
by deleting some elements without changing the order of the remaining elements */

class IsSubsequence{
	public static void main(String args[]){
		boolean output = findSubsequence("ade","abcdefgh");
		if(output)
			System.out.println("str1 is a subsequence of str2");
		else
			System.out.println("str1 is not a subsequence of str2");
	}
	
	public static boolean findSubsequence(String str1, String str2){
		
		if(str1.length() == 0)
			return true;
		
		int i = 0;
		int j = 0;
		
		while(i < str1.length() && j < str2.length()){
			
			if(str1.charAt(i) == str2.charAt(j))
				i++;
			
			if(str1.length() == i)
				return true;
			
			j++;
			
		}
		return false;
		
	}
}

/*
Input: str1 = "ade", str2 = "abcdefgh"
Output: True (str1 is a subsequence of str2)

Input: str1 = "AXY", str2 = "ADXCPY"
Output: True (str1 is a subsequence of str2)

Input: str1 = "AXY", str2 = "YADXCP"
Output: False (str1 is not a subsequence of str2)
*/
