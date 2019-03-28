import java.util.Scanner;
class Pattern21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		int min_star = 1;
		int l = 1;
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=1;k<=min_star;k++){
				System.out.print(Math.abs(k-l));
			}
			l++;
			min_star+=2;
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

     0
    101
   21012
  3210123
 432101234

*/