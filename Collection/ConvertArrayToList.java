import java.util.*;
class ConvertArrayToList{
	public static void main(String args[]){
		Integer arr[] = {2,5,6,5,9,556,2,3};
		// arraylist does not contain primitive data type so 
		// we create the Wrapper object
		List<Integer> list = Arrays.asList(arr); 
		System.out.println(list);
	}
}