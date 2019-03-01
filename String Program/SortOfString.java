public class SortOfString 
{
    public static void main(String[] args) {

        String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
    }

}

/*
Compare To 'a' b is : -1
Compare To 'b' a is : 1
Compare To 'b' b is : 0

Here,
Character a comes before b alphabetically. Hence output is -1
Character b comes after a alphabetically. Hence output is 1
Character b are equivalent, hence output is 0.
You can use method Use "compareToIgnoreCase" in case you don't want the result to be case sensitive.

*/