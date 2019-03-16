/* https://www.hackerrank.com/challenges/save-the-prisoner/problem
   Good Explanation - https://youtu.be/LeNU3WjrV_w
*/

static int saveThePrisoner(int n, int m, int s) 
{
   int r = m % n;
   if ((r + s - 1) % n == 0) 
   {
        return n;
   } else 
   {
        return ((r + s - 1) % n);
   }
}
