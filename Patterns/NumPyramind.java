import java.util.Scanner;
public class NumPyramind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid ? ");
        int rows = sc.nextInt();
		int rowCount = 1;
		for(int i=rows; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= rowCount; j++){
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
        
	}
}

/*
How Many Rows You Want In Your Pyramid?
6
Here Is Your Pyramid
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
*/