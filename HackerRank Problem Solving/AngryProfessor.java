/* https://www.hackerrank.com/challenges/angry-professor/problem */

static String angryProfessor(int k, int[] a) {
	int countOnTime = 0;
	for(int student: a){
		if(student <= 0)
			countOnTime++;
		}

	if(countOnTime>=k)
		return "NO";
	return "YES";
}