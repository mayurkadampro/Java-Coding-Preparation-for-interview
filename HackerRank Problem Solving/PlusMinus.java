/* https://www.hackerrank.com/challenges/plus-minus/problem
*/

static void plusMinus(int[] arr) {
    int positiveCount = 0;
    int NegativeCount = 0;
    int zeroCount = 0;
    for(int i : arr)
    {
        if(i>0)
        {
            positiveCount++;
        }else if(i < 0)
        {
            NegativeCount++;
		}else
        {
                zeroCount++;
        }
    }

    System.out.format("%f \n",(float)positiveCount/arr.length);
    System.out.format("%f \n",(float)NegativeCount/arr.length);
    System.out.format("%f \n",(float)zeroCount/arr.length);
	
    }