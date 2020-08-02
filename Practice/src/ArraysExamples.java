import java.util.Scanner;

public class ArraysExamples {

    public static void main(String args[])
    {
       /* String[] words = new String[6];
        words[0] = "BMW";
        words[1] = "Mercedes";
        words[2] = "Honda";
        words[3] = "Skoda";
        words[4] = "Ferrari";
        words[5] = "Toyota";

        for(String Cars : words)
        {
            System.out.println(Cars);
        } */
// Arrays for storing user input and then printing
       /* Scanner scan = new Scanner(System.in);
        System.out.println("How many data you want to store : ");
        int number = Integer.parseInt(scan.nextLine());
        String[] values = new String[number];

        for(int i=0; i<values.length;i++)
        {
            System.out.println("Enter the text");
            values[i] =scan.nextLine();
        }

        for(int i = 0; i<values.length;i++)
        {
            System.out.println(values[i]);
        } */

       //Examples for Multi dimensional Arrays

        int grid[][] = {
                {2,3,4},
                {1,2},
                {45,17,28}
        };

        System.out.println(grid[0][2]);
    }
}
