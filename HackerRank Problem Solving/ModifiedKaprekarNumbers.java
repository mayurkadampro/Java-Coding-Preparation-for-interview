/* https://www.hackerrank.com/challenges/kaprekar-numbers/problem 
A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the number into two integers and sum those integers, you have the same value you started with.
*/

import java.io.*;
import java.util.*;

public class ModifiedKaprekarNumbers{

    static boolean isKaprekar(int num) {
        String str = String.valueOf((long)Math.pow(num,2));
        String left  = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if (numL + numR == num) {
            System.out.print(num + " ");
            return true;
        } else {
            return false;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        boolean foundKaprekar = false;

        for (int num = p; num <= q; num++) {
            if (isKaprekar(num)) {
                foundKaprekar = true;
            }
        }
        if (!foundKaprekar) {
            System.out.println("INVALID RANGE");
        }
        scanner.close();
    }
}
