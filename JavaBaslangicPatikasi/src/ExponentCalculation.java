/* Task or Homework
 Make a program that calculates the exponent with the values entered by the user using "For Loop" in Java
 (Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız).
 */

import java.util.Scanner;

public class ExponentCalculation {
    public static void main(String[] args) {
        //Değişkenleri atıyoruz.
        int n, t, result = 1;
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan üssünü alacağı sayıyı ve üsse vereceği değeri alıyoruz.
        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen üs olacak sayıyı giriniz: ");
        t = input.nextInt();

        // Üs hesaplama için for döngüsü kullanıyoruz. 
        for (int i = 1; i <= t; i++) {
            result *= n;
        }
        System.out.println("Sonuç: " + result);
    }
}
