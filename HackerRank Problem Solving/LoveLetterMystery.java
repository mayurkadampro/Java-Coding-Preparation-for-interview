/* https://www.hackerrank.com/challenges/the-love-letter-mystery/problem */

static int theLoveLetterMystery(String s) {
	StringBuffer sb = new StringBuffer(s);
    String s1 = String.valueOf(sb.reverse());
    int count = 0;
    if(!s.equals(s1)){
		char c[] = s.toCharArray();
        for(int i=0,j=c.length-1; i<c.length/2; i++,j--){
            count+= Math.abs(c[i]-c[j]);
       }   
            return count;
    }
     return 0;
}