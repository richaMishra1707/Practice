import java.util.Scanner;

public class ConditionStats {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
       int N = scanner.nextInt();

       //Odd and Even Numbers Conditions
        /* if(N%2==0)
        {
            if(N>=2 && N<5 || N>20)
            {
                System.out.println("Not Weird");
            }
            else
            if (N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
        }
        else

            System.out.println("Weird");
*/

        //Prime Number test
        int x = N/2;
        int f=0,i;
        if(x==0||x==1)
        {
            System.out.printf("%d is not a prime number \n",N);

        }
        else {
            for (i = 2; i <= x; i++) {
                if (N % i == 0) {
                    System.out.printf("%d is not a prime number \n", N);
                    f++;
                    break;
                }
            }
            if (f==0)
                System.out.printf("%d is a prime number \n", N);
        }
        scanner.close();
    }
}
