/* https://www.hackerrank.com/challenges/day-of-the-programmer/problem
*/

static String dayOfProgrammer(int year) {
    if(year == 1918){
        return "26.09.1918";
    }else if(((year <= 1917) & (year%4 == 0)) | ((year%400 == 0) | ((year%4 ==0) & (year%100 != 0))))
    {
        return "12.09."+year;
    }

    return "13.09."+year;
}