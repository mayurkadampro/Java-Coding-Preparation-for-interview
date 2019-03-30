/* https://www.hackerrank.com/challenges/bigger-is-greater/problem */


    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String s1) {
        char ch[] = s1.toCharArray();
        String s2 = nextPermutation(ch);
        if(s2.compareTo(s1) == 0)
            return "no answer";
        else if(s2.compareTo(s1) != -1)
                return s2;

        return s1;
    }

    static String nextPermutation(char[] array) {
    // Find non-increasing suffix
    int i = array.length - 1;
    String s1 = new String();
    while (i > 0 && array[i - 1] >= array[i])
        i--;
    if (i <= 0)
        return String.valueOf(array);
    
    // Find successor to pivot
    int j = array.length - 1;
    while (array[j] <= array[i - 1])
        j--;
    char temp = array[i - 1];
    array[i - 1] = array[j];
    array[j] = temp;
    
    // Reverse suffix
    j = array.length - 1;
    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    return String.valueOf(array);
}
