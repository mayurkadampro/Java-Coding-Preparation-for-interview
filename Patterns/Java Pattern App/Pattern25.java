import java.util.Scanner;
class Pattern25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		int iter = 3;
		for(int i=1;i<=rows;i++){
			int num = 1;
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			for(int k=rows;k>=i-iter;k--){
				System.out.print(num);
				num++;
			}
			iter--;
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