/* Task
 Write a Java program that finds the largest and smallest numbers from N counting numbers entered
 from the keyboard and writes these numbers to the screen (Java ile klavyeden girilen N tane sayma sayısından
 en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın).
  */

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner maxmin = new Scanner(System.in);
        int quantity, number, maxNumber = 0, minNumber = 0;
        System.out.print("Lütfen kaç sayı gireceğinizi belirtiniz.: ");
        quantity = maxmin.nextInt();

        // Girilen sayı adedine göre kullanıcıdan veri istemek için for döngüsünü kullanıyoruz:
        for (int i = 1; i <= quantity; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            number = maxmin.nextInt();

            if (i == 1) {   // Büyük ve küçük sayıları bulmak için gereken kod bloklarını oluşturuyoruz.
                maxNumber = number;
                minNumber = number;
            }
            if (maxNumber <= number) {
                maxNumber = number;
            } else if (number <= minNumber) {
                minNumber = number;
            }
        }
        System.out.println("En Küçük sayı: " + minNumber);
        System.out.println("En Büyük Sayı: " + maxNumber);
    }
}
