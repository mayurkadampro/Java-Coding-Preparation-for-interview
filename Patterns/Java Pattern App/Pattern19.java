import java.util.Scanner;
class Pattern19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		int min_star = 1;
		for(int i=1;i<=rows;i++){
			
			for(int j=rows;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=min_star;j++){
				System.out.print(j);
			}
			System.out.println();
			min_star+=2;
		}
	}
}

/*
Enter Number Of Rows :
5

     1
    123
   12345
  1234567
 123456789

*/