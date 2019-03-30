import java.util.Scanner;
class Pattern24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		int count = 1;
		for(int i=1;i<=rows;i++){
			for(int j=0;j<i;j++){
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}
		
	}
}

/*
Enter Number Of Rows :
5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/