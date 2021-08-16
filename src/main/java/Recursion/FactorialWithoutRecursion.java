package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//FactorialWithoutRecursion
public class FactorialWithoutRecursion {

    public static void main(String[] args) {
        new ExampleDecimalToBinaryUsingRecursion();
        //new ExampleSumofDigitsUsingRecursion();
        findAllNegFactors();
        findAllFactors();
        System.out.println("5!  = " + factorial(5));
    }

    private static long factorial(int num) {
        long fact = 1;
        while (num > 0) {
            fact *= num--;
        }
        return fact;
    }

    //2.  positive factors of 60

    public static void findAllFactors() {
        int number = 60;

        System.out.print("Factors of " + number + " are: ");

        // loop runs from 1 to 60
        for (int i = 1; i <= number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //3. negative factors of 60
    public static void findAllNegFactors() {
    int number = -60;
    System.out.print("Factors of " + number + " are: ");

    // run loop from -60 to 60
    for(int i = number; i <= Math.abs(number); ++i) {

        // skips the iteration for i = 0
        if(i == 0) {
            continue;
        }
        else {
            if (number % i == 0) {
                System.out.print(i + " ");
            }

        }}}


// sum of digits using recursion - Sum of digits of 23 is 5
public static class ExampleSumofDigitsUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Sum of digits of "+num + " is " + sum(num));
    }

    public static int sum(int n){
        return n==0 ? 0 : n%10+sum(n/10);
    }

}
//ExampleDecimalToBinaryUsingRecursion - Enter a decimal number
//
//20
//
//10100
    public static class ExampleDecimalToBinaryUsingRecursion {

        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a decimal number");
            int num = Integer.parseInt(br.readLine());
            decToBin(num);
        }

        public static void decToBin(int n) {
            if (n > 0) {
                decToBin(n / 2);
                System.out.printf("%d", n % 2);
            }
        }
    }

}






