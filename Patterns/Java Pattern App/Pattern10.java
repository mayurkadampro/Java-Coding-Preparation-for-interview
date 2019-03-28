import java.util.Scanner;
class Pattern10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print((char)((j-1)+65)+" "); // for small replace 65 with 97
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

E D C B A
E D C B
E D C
E D
E

*/