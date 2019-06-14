/* https://www.hackerrank.com/challenges/sparse-arrays */

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int output[] = new int[queries.length];
        int sum=0;
        for(int i=0;i<queries.length;i++){
            sum=0;
            for(int j=0;j<strings.length;j++){
                if(queries[i].equals(strings[j])){
                    sum+=1;
                    output[i] = sum;
                }
            }
        }
        return output;
    }