import java.util.Scanner;
class Pattern15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		int min_star = 1;
		for(int i=0;i<rows;i++){
			
			for(int j=rows;j>i;j--){
				System.out.print(" ");
			}
			
			for(int j=0;j<min_star;j++){
				System.out.print("*");
			}
			System.out.println();
			min_star+=2;
		}
	}
}

/*
Enter Number Of Rows :
5

     *
    ***
   *****
  *******
 *********

*/