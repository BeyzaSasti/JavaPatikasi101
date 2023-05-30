       /* Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173   */


import java.util.Scanner;

public class Vucut_kitle_indeks {
    public static void main(String[] args) {
        // İlk olarak eğişkenleri atayalım.
        double kg, m, index;

        Scanner input = new Scanner(System.in);

        System.out.println("Vücut kitle indeksi hesaplama programına hoşgeldiniz." +
                "\nLütfen istenilen değerleri giriniz!");
        // Ardından kullanıcıdan değerleri alalım.

        System.out.print("Kaç kilogramsınız?: ");
        kg = input.nextDouble();

        System.out.print("Boyunuz? (Lütfen metre cinsinde giriniz!): ");
        m = input.nextDouble();

        index = kg / (m * m) ;
        System.out.println("Vücut kitle indeksiniz: " + index);



    }
}
