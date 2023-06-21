/* In Java, we are making a "Number Guessing Game" where we want the user to guess a number that the program randomly chooses between 0-100.
Java'da, kullanıcının programın 0-100 arasında rastgele seçeceği bir sayıyı tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz. */


package ArraysWorkingFolder;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(100);
        // ya da int value = (int) (Math.random() * 100) şeklinde kullanabiliriz.

        // Kullanıcıdan tahmin istiyoruz.
        Scanner number = new Scanner(System.in);
        int right = 0;
        int selected;
        int [] wrongValues = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz!" + " Oyunda bilmen gereken iki önemli kural var."
                + "\n1.Tahminler için gireceğin sayılar 0 ile 100 arasında olmalı !" + "\n2. Tahmin etme hakkın 5 ile sınırlıdır."
                + "\nHadi Başlayalım! :)" );

        //Kullanıcının gireceği tahmin sayısına limit(hak) koyuyoruz.
        while(right < 5) {
            System.out.print("Lütfen tahmini sayınızı giriniz: ");
            selected = number.nextInt();

            // Belirlenen sayı aralıklarında giriş yapması için koşul oluşturuyoruz.
            if(selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
                if(isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı tahmin girdiniz. Kalan tahmin hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            //Tahminin doğru olduğu ve olmadığı durumlar için koşul oluşturuyoruz.
            if(selected == value) {
                System.out.println("Tebrikler, tahmininiz doğru! Tahmin ettiğiniz sayı: " + value);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if(selected > value) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrongValues[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if(!isWin) {
            System.out.println("Kaybettiniz!" );
            if(!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrongValues) + "\nDoğru değer: " + value);
            }
        }
    }
}
