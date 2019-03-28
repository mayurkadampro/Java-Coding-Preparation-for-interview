import java.util.Scanner;
class Pattern9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=rows-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print((char)(i+65)+" "); // for small replace 65 with 97
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

E E E E E
D D D D
C C C
B B
A

*/