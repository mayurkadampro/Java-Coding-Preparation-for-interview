import java.util.Scanner;
import java.util.Arrays;
class GoogleProbOne2019{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Test Cases : ");
		int t = sc.nextInt();
		int arr[] = new int[t];
		for(int k=0;k<t;k++){
			arr[k] = sc.nextInt();
		}
		for(int i=0;i<t;i++){
			String str = String.valueOf(arr[i]);
			char ch[] = str.toCharArray();
			char chh[] = new char[str.length()];
			for(int j=0;j<ch.length;j++){
				if(ch[j] == '4'){
					ch[j] = '3';
					chh[j] = '1';
				}else{
					chh[j] = '0';
				}
			}
			
			System.out.print("Case #"+(i+1)+": ");
			for(char value : ch){
				System.out.print(value);
			}
			System.out.print(" ");
			for(char value : chh){
				System.out.print(value);
			}
			System.out.println();
			
		}
	}
}