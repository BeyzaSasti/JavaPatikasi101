
/*  Pratik - Hava Sıcaklığına Göre Etkinlik Önerme

Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

import java.util.Scanner;

public class Prattik_HavayaGoreEtk {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığa göre Etkinlik Önerimine Hoşgeldiniz!" +
                "\nLütfen Hava Sıcaklığını Giriniz: ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapmaya ne dersiniz? Kayak için mükemmel bir hava.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinema için güzel bir gün!");
            }
            if (heat >= 10) {
                System.out.println("Aslında şu mis gibi havada piknik yapmak enerjinizi tazeleyebilir.");
            }
            if (heat <= 15 && heat >= 10) {
                System.out.println("Her ikisini de yapmaya ne dersiniz! :)");
            }
        } else {
            System.out.println("Havuza girmek sıcaklığınıza iyi gelecek sizi serinletecektir!");
        }
    }
}
