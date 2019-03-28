import java.util.Scanner;
class AlphabetPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i;j++){
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
	}
}

/*
Enter number of rows :
5
a
b b
c c c
d d d d
e e e e e
*/