import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {

    public static void main(String args[])
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        String n = scanner.nextLine();
        BigInteger big1 = new BigInteger(n);
       System.out.println(big1.isProbablePrime(1)? "prime": "not prime");
        scanner.close();
    }
}
