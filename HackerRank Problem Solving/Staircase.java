/*	https://www.hackerrank.com/challenges/staircase/problem
*/    
	
static void staircase(int n) 
{
    for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
            System.out.print(" ");
        }

        for(int k=1;k<=i;k++)
        {
            System.out.print("#");
        }
        System.out.println();
    }
}

/*
Sample Input
6 
Sample Output
     #
    ##
   ###
  ####
 #####
######
*/