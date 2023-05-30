/*
        Artık Yıl Nasıl Hesaplanır?
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

 */
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // değişkenleri atıyoruz.
        int year;
        String leapyear = "";

        // Artık yıl için kullanıcan veri istiyoruz.
        System.out.print("Artık yıl hesaplama programına Hoşgeldiniz!\nLütfen yıl giriniz: ");
        year = input.nextInt();

        // Kullanıcıdan alınan veri ile hesaplama için koşulları sağlayalım;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leapyear = "\tArtık yıldır.";
            } else {
                leapyear = "\tArtık yıl Değildir.";
            }
            }
        else if (year % 4 == 0) {
                leapyear = "\tArtık yıldır";
            } else {
            leapyear = "\tArtık yıl Değildir.";
        }
        System.out.println(year + "'ı" +leapyear);
    }
}
