import java.util.Scanner;
class Pattern4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=0;j<i;j++){
				System.out.print((char)(j+65)+" "); // for small replace 65 with 97
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

A
A B
A B C
A B C D
A B C D E

*/