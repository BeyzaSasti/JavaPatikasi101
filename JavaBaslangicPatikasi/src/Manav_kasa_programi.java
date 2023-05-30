  /*  Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/



import java.util.Scanner;

public class Manav_kasa_programi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Değişkenleri tanımlayalım.
        double armut = 2.14, armutKg, elma = 3.67, elmaKg, domates = 1.11, domatesKg,
                muz = 0.95, muzKg,  patlican = 5.00, patlicanKg, toplamFiyat ;

        System.out.print("Armut kaç kg?: ");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kg?: ");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kg?: ");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kg?: ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kg?: ");
        patlicanKg = input.nextDouble();

        toplamFiyat = (armut * armutKg) + (elma * elmaKg) +
                (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Ödeyeceğiniz Tutar: " + toplamFiyat + "TL");

    }
}
