class StringTwo
{
	public static void main(String args[])
	{
		System.out.println(fun()); //it gives error which is non static member cannot be called directly
	}
	
	int fun()
	{
		return 1;
	}
}