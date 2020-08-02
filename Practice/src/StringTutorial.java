import java.awt.*;
import java.util.Scanner;

public class StringTutorial {

    public static void main(String args[])
    {
       /*     int myInt = 7;
            String myString = "An inside story";

        System.out.println(myString);

*/

       Scanner scan = new Scanner(System.in);
       String A = scan.nextLine();
       String B = scan.nextLine();

       int result = A.length() + B.length();

       System.out.println("Sum of lengths " + result);

       if(A.compareTo(B) > 0)
       {
           System.out.println("Yes");
       }
       else
           System.out.println("No");

        String output1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(output1 + " " + output2);
    }
}
