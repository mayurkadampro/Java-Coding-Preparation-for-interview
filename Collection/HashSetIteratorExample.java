import java.util.*;
class HashSetIteratorExample{
	public static void main(String args[]){
		HashSet<String> hashset = new HashSet<String>();
		// Add elements to HashSet
		hashset.add("Pear");
		hashset.add("Apple");
		hashset.add("Banana");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana"); // only contain unique elements if its found duplicate then simply it remove

		// Get iterator
		Iterator<String> it = hashset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}