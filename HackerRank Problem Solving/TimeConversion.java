/* https://www.hackerrank.com/challenges/time-conversion/problem
*/

static String timeConversion(String s) {

    //First Tokenizing
    String[] str = s.split(":");
    int hour = Integer.parseInt(str[0]);
    String minutes = str[1];
    String secPeriod = str[2];
    String sec = str[2].substring(0, secPeriod.length() - 2);
    String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

    String updatedTime = "";

	// let's compare
    if ((hour >= 0 && hour < 12) && (period.equalsIgnoreCase("AM"))) {
        updatedTime = String.format("%02d", hour) + ":" + minutes + ":" + sec;
    } else if ((hour >= 0 && hour < 12) && period.equalsIgnoreCase("PM")) {
        updatedTime = (12 + hour) + ":" + minutes + ":" + sec;
    } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
        updatedTime = "00" + ":" + minutes + ":" + sec;
    } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
        updatedTime = hour + ":" + minutes + ":" + sec;
    }
	return updatedTime;
}