class MethodOverloading {
	static int add(int a, int b){
		return a+b;
	}
	static double add( double a, double b){
		return a+b;
	}
	static double add( double a, double b, double c){
		return a+b+c;
	}
 
	public static void main(String args[]){
		System.out.println(MethodOverloading.add(11,11));
		System.out.println(MethodOverloading.add(12.3,12.6));
		System.out.println(MethodOverloading.add(12.3,12.6,10.24));
	}
}