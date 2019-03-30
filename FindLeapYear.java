import java.io.Console;
class FindLeapYear{
	public static void main(String args[]){
		Console input = System.console();
		int year = Integer.parseInt(input.readLine("Enter Year : "));
		System.out.println(calLeapYear(year));
	}
	
	static String calLeapYear(int year){
		if(year%4==0 || (year%400==0 && year%100 != 0)){
			return "Leap year";
		}
		return "Not a Leap year";
	}
}