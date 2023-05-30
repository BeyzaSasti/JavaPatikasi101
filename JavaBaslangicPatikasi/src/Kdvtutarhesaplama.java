import java.util.Scanner;

public class Kdvtutarhesaplama {
    public static void main(String[] args) {
        // Ondalıklı sayılar kullanılacağı için Double türünü kullanıyoruz.

       double tutar, kdvOran, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Ücret Tutarını Giriniz! : ");
        tutar = input.nextDouble();

        /* Girilen tutarın 0 - 1000 TL arası olduğu durum ve 1000 TL'den yüksek olduğu durum için
        belirlenmiş olan KDV oranlarını koşul operatörü ile kodluyoruz.  */

        kdvOran = (tutar > 1000 ? kdvOran2 : kdvOran1 );
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutarı: " + kdvliTutar);

        }
    }
