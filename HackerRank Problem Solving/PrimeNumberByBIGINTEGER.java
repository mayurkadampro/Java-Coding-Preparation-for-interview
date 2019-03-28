/* https://www.hackerrank.com/challenges/java-primality-test/problem */

import java.util.*;
import java.math.BigInteger;

class PrimeNumberByBIGINTEGER {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        if(n.isProbablePrime(1))
        {
            System.out.println("prime");
        }else
        {
            System.out.println("not prime");
        }
        scanner.close();
    }
}

/*

Sample Input
13

Sample Output
prime

*/