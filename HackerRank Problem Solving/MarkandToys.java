/* https://www.hackerrank.com/challenges/mark-and-toys/problem */

static int maximumToys(int[] prices, int k) {
	int toy_count = 0;
	if (prices.length < 0 || k == 0)
		return toy_count;
        
        Arrays.sort(prices);

    for(int i=0; i<prices.length; i++){
		k = k - prices[i];
        if(k < 0)
			return toy_count;
        toy_count++;
    }

    return toy_count;
}

    