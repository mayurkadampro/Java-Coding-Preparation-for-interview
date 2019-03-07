import java.util.Scanner;
public class FibonacciByRecursion
{  
	static int a=0,b=1,c=0;    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Single Number : ");
		int count = sc.nextInt();
		System.out.println(a);
		System.out.println(b);    
		printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}
  
   static void printFibonacci(int count){    
    if(count>0){    
         c = a + b;    
         a = b;    
         b = c;    
         System.out.println(c);   
         printFibonacci(count-1);    
     }    
 }    

 
}  