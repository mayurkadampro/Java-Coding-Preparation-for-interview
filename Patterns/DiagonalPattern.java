import java.util.Scanner;
class DiagonalPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Rows : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j)
					System.out.print("# ");
				else
					System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
/*
Enter Number Of Rows : 5
# 2 3 4 5
2 # 6 8 10
3 6 # 12 15
4 8 12 # 20
5 10 15 20 #
*/