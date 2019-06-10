// Remove All Adjacent Duplicates from a String
import java.util.Stack;
class RemoveAdjacentDuplicate{
	public static void main(String args[]){
		System.out.println(removeAdjacentDuplicate("aabbcabbdhhb"));
	}
	
	static String removeAdjacentDuplicate(String str){
		Stack<Character> st = new Stack();
		for(int i=0;i<str.length();i++){
			if(!st.isEmpty() && st.peek() == str.charAt(i)){
				st.pop();
			}else{
				st.push(str.charAt(i));
			}
		}
		return st.toString();
	}
}

/* Output :- [c, a, d, b]*/