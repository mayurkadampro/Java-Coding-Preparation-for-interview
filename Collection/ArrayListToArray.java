import java.util.*;
class ArrayListToArray{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(550);
		list.add(60);
		
	System.out.println(list);
	
	// convert arraylist into arraylist
	
	// without method
	int arr[] = new int[list.size()];
	for(int i=0;i<arr.length;i++){
			arr[i] = list.get(i);
	}
	System.out.println(Arrays.toString(arr));
	
	// with method
	Integer arrr[]= list.toArray(new Integer[list.size()]);
	System.out.println(Arrays.toString(arrr));
	
	
	Object arrrr[] = list.toArray();
	System.out.println(Arrays.toString(arrrr));
	
	}
}