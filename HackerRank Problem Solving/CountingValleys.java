/*https://www.hackerrank.com/challenges/counting-valleys/problem
*/

static int countingValleys(int n, String s) {
        int altitude = 0;
        int valley = 0;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='U')
            {
                altitude++;
                if(altitude == 0)
                {
                    valley++;
                }
            }else
            {
                altitude--;
            }
        }
	return valley;
}
