/*
   We are writing a program in Java that finds the harmonic series of an input number
   (Java ile girilen sayının harmonik serisini bulan program yazıyoruz).

   Harmonic Series Formula:
    1+ (1/2) + (1/3) + (1/4) + ... + (1/n) */

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter to number: ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }

        System.out.println("Harmonic Series Formula Result: " + result);
    }
}
