/* Task Or Homework (Ödev)
Write a program that calculates the sum of the digits of a number
(Bir sayının basamak sayılarının toplamını hesaplayan program yazınız). */


import java.util.Scanner;

public class SumOfDigitAndArmstrongNumbers {
    public static void main(String[] args) {
        int number, digitNumber = 0, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz: "); //Kullanıcıdan veriyi alıyoruz.
        number = input.nextInt();

        while(number != 0) {         // Basamak sayısını bulma ve kalanı bulma formüllerini kullanarak...
            digitNumber = number%10;  // ...basamakların toplamını buluyoruz.
            number = number / 10;
            sum = sum + digitNumber;
        }

        System.out.println("Sayının basamakları toplamı: " + sum);
    }
}


/* Girilen Sayının Armstrong Olup Olmadığını Bulan Program.

        int number, digitNumber = 0;     // Değişkenleri atıyoruz.
        System.out.print("Lütfen bir sayı giriniz: "); // Kullanıcıdan veri istiyoruz.
        number = input.nextInt();
        int tempNumber = number;
        int digitValue;
        int result = 1;
        int digitPow;

        // Basamak sayısını buluyoruz.
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }

        // Sayının son basamağını bulma.
        tempNumber = number;
        while(tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= digitNumber; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı Armstrong sayı değildir.");
        } */