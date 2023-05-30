/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */


import java.util.Scanner;

public class SinifGecmeDrumu {
    public static void main(String[] args) {
        int math, pyhsics, chemistry, turkish, music, valid = 0, validGrade = 0;

        Scanner input = new Scanner(System.in);

        /* valid değişkeni, kaç tane geçerli not olduğunu ifade etmektedir.
           validGrade değişkeni ise geçerli puanları ifade etmektedir.
           Böylelikle geçerli olmayan puan ve dersler ortalama hesaplamasına dahil edilmemiş olacaktır.*/


        System.out.println("Lütfen notlarınızı giriniz!");
        System.out.print("Matematik notunuz: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100){
            validGrade += math;
            ++valid;
        }

        System.out.print("Fizik notunuz: ");
        pyhsics = input.nextInt();
        if (pyhsics <= 100 && pyhsics >= 0) {
            validGrade += pyhsics;
            ++valid;
        }

        System.out.print("Kimya notunuz: ");
        chemistry = input.nextInt();
        if(chemistry <= 100 && chemistry >= 0) {
            validGrade += chemistry;
            ++valid;
        }

        System.out.print("Türkçe notunuz: ");
        turkish = input.nextInt();
        if (turkish <= 100 && turkish >= 0) {
            validGrade += turkish;
            ++valid;
        }

        System.out.print("Müzik notunuz: ");
        music = input.nextInt();
        if (music <= 100 && music >= 0) {
            validGrade += music;
            ++valid;
        }

        double avarage = validGrade / valid;
        if (avarage <= 55) {
            System.out.println("Dikkat! Sınıfta kaldınız. Lütfen daha iyi çalışınız.");
        } else {
            System.out.println("Tebriklerr! Sınıfı geçtiniz! :)");
        }

        System.out.println("Not Ortalamanız: " + avarage);



    }
}
