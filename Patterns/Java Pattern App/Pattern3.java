import java.util.Scanner;
class Pattern3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		drawPattern(rows);
	}
	
	static void drawPattern(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*
Enter Number Of Rows :
5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/