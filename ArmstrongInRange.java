import java.io.Console;
public class ArmstrongInRange
{
	 public static void main(String[] args) 
     {
		Console input = System.console();
		int range = Integer.parseInt(input.readLine("Enter Integer value : "));
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
		for(int i = 1; i <= range; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	 }
}