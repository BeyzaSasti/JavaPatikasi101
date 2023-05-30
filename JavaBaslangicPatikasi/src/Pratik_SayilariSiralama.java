     /* Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. */
import java.util.Scanner;
public class Pratik_SayilariSiralama {
    public static void main(String[] args) {
        int a, b, c;
        // Kullanıcıdan verileri istiyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Hoşgeldiniz! Lütfen sıralama için sayıları giriniz." +
                "\n1. Sayı: ");
        a = input.nextInt();

        System.out.print("2. sayı: ");
        b = input.nextInt();

        System.out.print("3. Sayı: ");
        c = input.nextInt();

        // Kullanıcının girdiği verilere göre sıralamayı gerçekleştirecek koşulları oluşturuyoruz.
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            } else {
                System.out.print("b < c < a");
            }
        }else {
            if (a < b) {
                System.out.print("c < a < b");
            } else {
                System.out.print("c < b < a");
            }
        }
    }
}
