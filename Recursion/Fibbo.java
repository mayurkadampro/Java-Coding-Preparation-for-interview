class Fibbo{

	static int a = 0;
	static int b = 1;
	static int c = 0;
	static void fibbo(int n){
		if(n>0){
		   c = a+b;
		   a = b;
		   b = c;
		   System.out.print(c+" ");
		   fibbo(n-1);
		}
		
	}
	
	public static void main(String args[]){
		System.out.print(a+" ");
		System.out.print(b+" ");
		fibbo(10);
	}
}