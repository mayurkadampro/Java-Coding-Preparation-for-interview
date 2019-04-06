import java.util.Arrays;
class BSString{
	public static void main(String args[]){
		String colors[] = {"blue","red","green","yellow","orange"};
		Arrays.sort(colors);
		System.out.println(Arrays.toString(colors));
		int x = Arrays.binarySearch(colors,"red");
		int y = Arrays.binarySearch(colors,"purple");
		System.out.println(x+" : "+y);
	}
}