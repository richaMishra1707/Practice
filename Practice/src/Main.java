import  java.util.Scanner;

class Solution {

    public static void main(String args[])
    {
        System.out.println("Hello World");
        /*lets code*/
        StringTutorial obj1 = new StringTutorial();
        DataVariables dv1 = new DataVariables();
        Loops lp1 = new Loops();

        //STDIN AND STDOUT EXAMPLE

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
       // int b = scan.nextInt();
       // int c = scan.nextInt();

        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        scan.close();
        System.out.println(s);
        System.out.println(d);
        System.out.println(a);
       // System.out.println(b);
        //System.out.println(c);


    }
}