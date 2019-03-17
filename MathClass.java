//import java.math.*; 
public class MathClass 
{
	public static void main(String args[])
	{
	
	// Use of .abs() method to get the absoluteValue 
    System.out.println("Absolute value of int -1 : "+Math.abs(-1)); 
    System.out.println("Absolute value of int -2.5f : "+Math.abs(-2.5f)); 
    System.out.println(""); 
	
    // get the result of addExact method
	int a = 1, b = 8; 
    int radd = Math.addExact(a,b); //method returns the sum of the passed arguments.
    System.out.println("Using addExact(1,8) : "+radd); 
    System.out.println(""); 

    // Use of cbrt() method 
    double cbrtval = Math.cbrt(216); //method returns the cube root of the passed argument.
    System.out.println("cube root of 216 : "+cbrtval);
	System.out.println("");
	
	/* Use of floor method method returns the floor value of an argument.
	i.e. the closest integer value which is either less or equal to the the passed argument. 
	eg : 101.23 has floor value = 101 */
    double f1 = 30.56, f2 = -56.34;  
    System.out.println("Floor value of 30.56 : "+Math.floor(f1)); 
   
    System.out.println("Floor value of -56.34 : "+Math.floor(f2)); 
    System.out.println(""); 
	
	//ceil function
	System.out.println("Ceil value of 30.56 : "+Math.ceil(f1)); 
   
    System.out.println("Ceil value of -56.34 : "+Math.ceil(f2)); 
    System.out.println("");
	
	// Use of round() method  
    System.out.println("Round off 30.56  = " + Math.round(f1)); 
	
    System.out.println("Round off -56.34 = " + Math.round(f2)); 
    System.out.println("");
    
    // Use of log() method 
    double l = 10; 
    l = Math.log(l); //  method returns the logarithmic value of the passed argument.
    System.out.println("Log value of 10 : "+l);
	System.out.println("");
	
	// Use of signum() method 
    double x = 10.4556, y = -23.34789; 
    double signm = Math.signum(x); 
    System.out.println("Signum of 10.45  = " + signm); 
  
    signm = Math.signum(y); 
    System.out.println("Signum of -23.34 = " + signm); 
    System.out.println("");  
  
    // Use of max() method on r1 and r2 
    //double m = Math.max(r1, r2); 
    //System.out.println("Max b/w r1 and r2 = " + r2);
	
	
		
	}
}