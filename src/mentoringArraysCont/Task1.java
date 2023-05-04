package mentoringArraysCont;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

     /*

    Write a program that fills an array with n integers entered by the user.
    Suppose That The user can enter at least 1 number and at most 15 numbers

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements?(max 15)");
        int n=scan.nextInt();

        while (n>15 || n<1){
            System.out.println("Invalid entry.Try again.");
            n=scan.nextInt();
        }
        int[] numbers=new int[n];
        System.out.println("Enter "+n+" numbers");
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[]numbers) {
        System.out.println("Elements are:");
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[]numbers) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scan.nextInt();
        }

    }
}
