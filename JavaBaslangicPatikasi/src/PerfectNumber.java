/* Task Or Homework
Write a program in Java that finds out whether a number entered from the keyboard is a perfect number
or not and writes the statement "it is a perfect number" if the number is a perfect number and
"it is not a perfect number" if the number is not a perfect number (Klavyeden girilen bir sayının
mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse
“mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız).
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, conclusion = 0;
        Scanner perfectNum = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz: ");
        number = perfectNum.nextInt();

        // Girilen sayının kalansız bölenlerini bularak topluyoruz.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                conclusion += i;
            }
        } // Çarpanların toplamı sayının kendisine eşit olduğu veya olmadığı durumlar için koşulları sağlıyoruz.
        if (conclusion == number) {
            System.out.print(number +" sayısı bir Mükemmel sayıdır.");
        }else {
            System.out.print(number + " sayısı bir Mükemmel sayı DEĞİLDİR!");
        }
    }
}
