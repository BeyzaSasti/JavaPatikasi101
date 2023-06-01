/* Program to calculate combination.
   Task or homework
   Write a program in Java that calculates the combination
   (Java ile kombinasyon hesaplayan program yazınız).

   Combination Formula(Kombinasyon Formülü):
   C(n,r) = n! / (r! * (n-r)!) */

import java.util.Scanner;

public class CombinationCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenleri atıyoruz ve kullanıcıdan verileri istiyoruz.
        int n, r, nFact = 1, rFact = 1, nrFact = 1, combination = 1;
        System.out.print("Kombinasyon hesaplama programına hoş geldiniz!" +
                "\nKombinasyon hesabı için 2 sayı girmeniz gerekmektedir." +
                "\nLütfen ilk sayıyı(n) giriniz: " );
        n = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı(r) giriniz: ");
        r = input.nextInt();

        // n değeri için faktöriyel hesaplamasını yapıyoruz.
        for(int i = 1; i <= n; i++) {
            nFact = nFact * i;
        }
        System.out.println(n + "! Değeri: " + nFact);

        // r değeri için faktöriyel hesaplamasını yapıyoruz.
        for (int i = 1; i <= r; i++) {
            rFact = rFact * i;
        }
        System.out.println(r + "! Değeri: " + rFact);

        // (n-r) için faktöriyel hesaplamını yapıyoruz.
        for (int i = 1; i <= (n-r); i++) {
            nrFact = nrFact * i;
        }
        System.out.println("n-r:" + (n-r) + "! Değeri: " + nrFact);

        combination = nFact / (rFact * nrFact);
        System.out.println("Kombinasyon sonucu: " + combination);

    }
}
