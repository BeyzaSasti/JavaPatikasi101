/* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360 */



import java.util.Scanner;


public class Daire_alan_cevre {
    public static void main(String[] args) {
        // Değerleri atıyoruz.
        int r;
        double pi = 3.14, alan, cevre, alfa, malfa ;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri istiyoruz.
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Lütfen merkez açının ölçüsünü giriniz: ");
        alfa = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        malfa = ((pi * (r * r) * alfa) / 360);

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + malfa);

    }
}
