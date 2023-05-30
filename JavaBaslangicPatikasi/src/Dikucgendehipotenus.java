/*
   Kullanıcıdan alınan değerler ile üçgenin çevresini ve alanını hesaplamak
   için gereken formüller:

   Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

   𝑢 = (a+b+c) / 2

   Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */




import java.util.Scanner;

public class Dikucgendehipotenus {
    public static void main(String[] args) {
        // İlk olarak integer ve double olacak şekilde değişkenleri belirliyoruz.
        int a, b, c;
        double u, alan, cevre;

        // Kullanıcıdan verilerimizi istiyoruz.
        Scanner deger = new Scanner(System.in);

        System.out.print("Lütfen belirtilen yerleri doldurunuz!");
        System.out.print("\n Birinci kenarı giriniz: ");
        a = deger.nextInt();

        System.out.print("İkinci kenarı giriniz: ");
        b = deger.nextInt();

        System.out.println("Üçüncü kenarı giriniz: ");
        c = deger.nextInt();

        // Üçgenin alanını bulmamız için yüksekliği(u) bulmamız lazım.

        u = ((a + b + c) / 2.0);
        cevre = (a + b + c);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
