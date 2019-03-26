import java.util.*;
class FreqOfCharactersAlternateWay{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = sc.nextLine();
		calFreq(str);
	}
	
	static void calFreq(String str){
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<= 90){
				arr[str.charAt(i)-65]++;
			}else  if(str.charAt(i)>=97 && str.charAt(i)<= 122)
			{
				arr[str.charAt(i)-97]++;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0)
				System.out.println((char)(i+65)+" "+arr[i]);
		}
	}
}