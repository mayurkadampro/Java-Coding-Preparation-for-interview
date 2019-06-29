/* Given two strings str1 and str2, find if str1 is a subsequence of str2. 
A subsequence is a sequence that can be derived from another sequence 
by deleting some elements without changing the order of the remaining elements */

class IsSubsequenceRecursive{
	public static void main(String args[]){
		String str1 = "ade"; 
        String str2 = "abcdefgh"; 
        int m = str1.length(); 
        int n = str2.length(); 
		boolean output = findSubsequence(str1, str2, m, n);
		if(output)
			System.out.println("str1 is a subsequence of str2");
		else
			System.out.println("str1 is not a subsequence of str2");
	}
	
	public static boolean findSubsequence(String str1, String str2, int m, int n){
		
		if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
              
        // If last characters of two strings are matching 
        if (str1.charAt(m-1) == str2.charAt(n-1)) 
            return findSubsequence(str1, str2, m-1, n-1); 
  
        // If last characters are not matching 
        return findSubsequence(str1, str2, m, n-1); 
		
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
