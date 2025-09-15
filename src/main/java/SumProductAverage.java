/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;


public class SumProductAverage {
    public static void main(String[] args) {
        // TODO
        //Signature
        System.out.println("Adam Sagin\nArithmetic Program\n");


        //Declare the scanner
        Scanner sc = new Scanner(System.in);


        //Find number of runs
        System.out.println("Enter number of runs:  ");
        int runs = sc.nextInt();


        //Repeat for number of runs
        while (runs-- > 0) {
            //Declare and initialize the 3 user inputs
            System.out.println("Enter 3 numbers:");
            double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();


            //Print out the sum, difference, product, and average
            System.out.println("The sum is " + (a + b + c));
            System.out.println("The product is " + (a * b * c));
            System.out.println("The average is " + (a + b + c) / 3 + "\n");
        }


    }
}
