/* https://www.hackerrank.com/challenges/birthday-cake-candles/problem
*/

static int birthdayCakeCandles(int[] ar) 
{
	int largeCandle = ar[0];
    int count=0;
    for(int a: ar)
    {
        if(a==largeCandle)
        {
            count++;
        }

        if(a>largeCandle)
        {
            largeCandle = a;
            count = 1;
            }
        }
        return count;
    }