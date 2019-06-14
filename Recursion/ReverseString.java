class ReverseString{
	static String str = "Mayurr";
	static char ch[] = str.toCharArray();
	public static void main(String args[]){
		
		System.out.println(reverseString(0,str.length()-1));
	}
	static String reverseString(int start, int end){
		
		if(start>end){
			return String.valueOf(ch);
		}
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		return reverseString(start+=1,end-=1);
	}
}