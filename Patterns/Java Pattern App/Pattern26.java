import java.util.Scanner;
class Pattern26{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=rows; j>=i;j--){
				if(j!=rows-1 || j!=i+1){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

 1234567
  12345
   123
    1

*/