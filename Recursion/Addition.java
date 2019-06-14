class Addition{
	// add 5 number in 10 times by recursion
	public static void main(String args[]){
		System.out.println(addition(5,10));
	}
	static int sum = 0;
	static int addition(int N,int count){
		
		if(count>0){
			sum = sum + N;
			addition(5,count-1);
		}
		return sum;
	}
}