/* Homework or Task
   Write the EBOB and EKOK values of two numbers using "While Loop" in Java.
   (Java'da "While döngüsü" kullanarak iki sayının EBOB EKOK değerlerini yazdırınız. ")
   */
import java.util.Scanner;

public class EbobEkokProgram {
    public static void main(String[] args) {
        Scanner obEk = new Scanner(System.in);
        int n1, n2, ebob = 0, ekok = 0;
        // Değişkenleri atayarak, kullanıcıdan değerleri istiyoruz.
        System.out.print("Lütfen ilk değeri (n1) giriniz: ");
        n1 = obEk.nextInt();
        System.out.print("Lütfen ikinci değeri (n2) giriniz: ");
        n2 = obEk.nextInt();

        // EBOB değeri için bölenleri, sondan başa doğru bulan kod bloklarını oluşturuyoruz.
        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i --;
        }
        System.out.println("EBOB: "+ ebob);

        // EKOK değeri için kod bloklarını oluşturuyoruz.
        int k = 1;
        while (k <= n1 * n2) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK: " + ekok);
    }
}
