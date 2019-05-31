/* https://www.hackerrank.com/challenges/the-time-in-words/problem */

static String timeInWords(int h, int m) {
	ArrayList<String> numbers = new ArrayList<>();
    numbers.add("zero"); 
    numbers.add("one");
    numbers.add("two");
    numbers.add("three");
    numbers.add("four");
    numbers.add("five");
    numbers.add("six");
    numbers.add("seven");
    numbers.add("eight");
    numbers.add("nine");
    numbers.add("ten");
    numbers.add("eleven");
    numbers.add("twelve");
    numbers.add("thirteen");
    numbers.add("fourteen");
    numbers.add("fifteen");
    numbers.add("sixteen");
    numbers.add("seventeen");
    numbers.add("eighteen");
    numbers.add("nineteen");
    numbers.add("twenty");
    numbers.add("twenty one");
    numbers.add("twenty two");
    numbers.add("twenty three");
    numbers.add("twenty four");
    numbers.add("twenty five");
    numbers.add("twenty six");
    numbers.add("twenty seven");
    numbers.add("twenty eight");
    numbers.add("twenty nine");
	
	String currentTime  = "";
    if (m == 0) {
		currentTime = numbers.get(h) + " o' clock";
    }else if (m == 15) {
        currentTime = "quarter past " + numbers.get(h);
    }else if (m == 30) {
        currentTime = "half past " + numbers.get(h);
    }else if (m == 45) {
        currentTime = "quarter to " + numbers.get(h+1);
    }else if (m < 30) {
        currentTime = numbers.get(m) + " minute" + (m <= 1 ? "" : "s") + " past " + numbers.get(h);
    }else {
        currentTime = numbers.get(60 - m) + " minute" + ((60 - m) <= 1 ? "" : "s") + " to " + numbers.get(h+1);
    }

    return currentTime; 
    }