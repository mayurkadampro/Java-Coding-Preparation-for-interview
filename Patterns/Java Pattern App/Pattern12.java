import java.util.Scanner;
class Pattern12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			
			for(int j=rows;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

     *
    * *
   * * *
  * * * *
 * * * * *

*/