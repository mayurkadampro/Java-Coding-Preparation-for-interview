import java.util.Scanner;
class Pattern8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(j+" "); // for small replace 65 with 97
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/