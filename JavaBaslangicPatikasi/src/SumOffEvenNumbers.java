/*Ödev
  Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
  girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

  This program uses Java loops to accept input from the user until a single number is entered.
  And the numbers that are even and a multiple of 4 are summed and printed on the screen.
 */

import java.util.Scanner;

public class SumOffEvenNumbers {
    public static void main(String[] args) {
        // Değişkenleri atıyoruz.
        int number;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Lütfen sayı giriniz: ");
            number = scan.nextInt();
            // Girilen sayının 2 ve 4 'e tam bölünebiliyor olması için gereken koşulu sağlıyoruz.
            if((number % 2 ==0) || (number % 4 == 0)) {
                total += number;
            }
         // Sayı tek ise programın bitmesi için gereken döngüyü oluşturuyoruz.
        } while (number % 2 == 0);

        System.out.println("Toplam: " + total);
        }
    }

