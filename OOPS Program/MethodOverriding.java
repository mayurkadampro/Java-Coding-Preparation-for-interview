class BowlerClass{
	void bowlingMethod()
	{
		System.out.println(" bowler ");
	}
	int add(int a, int b)
	{
		System.out.println(" In bowler ");
		return a+b;
	}
}

class FastPacer{
	void bowlingMethod()
	{
		System.out.println(" fast bowler ");
	}
	int add(int a, int b)
	{
		System.out.println(" In fast bowler ");
		return a+b;
	}
}


public class MethodOverriding{
	public static void main(String[] args)
	{
		FastPacer obj= new FastPacer();
		obj.bowlingMethod();
		System.out.println(obj.add(10,30));
	}
}
