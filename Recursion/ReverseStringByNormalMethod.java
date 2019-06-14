class ReverseStringByNormalMethod{
	public static void main(String args[]){
		System.out.println(reverseString("M"));
	}
	
	static String reverseString(String str){
		if (str.isEmpty() || str == null || str.length() <= 0)
            return str;
		return reverseString(str.substring(1)) + str.charAt(0);
		
	}
}