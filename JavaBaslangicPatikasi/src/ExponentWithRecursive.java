/* Task or Homework
  Exponent Calculation with Recursive Methods
  (Recursive Metotlar ile Üslü Sayı Hesaplama)*/


import java.util.Scanner;

public class ExponentWithRecursive {
    static int exponent(int baseValue, int exponentValue) { //Değişkenleri atıyoruz.
        int result = 1;
        for (int i = 1; i <= exponentValue; i++) { //İşlemin başını ve sonunu bildiğimiz için...
            if (exponentValue == 0 ) {  // ...for döngüsünü kullanıyoruz ve üssün 0 olduğu durum için...
                return 1; // ... koşul oluşturuyoruz.
            } else {
                result *= baseValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner exponent = new Scanner(System.in); // Kullanıcıdan değerleri alıyoruz.
        System.out.print("Lütfen Taban değerini giriniz: ");
        int baseValue = exponent.nextInt();

        System.out.print("Lütfen Üs değerini giriniz: ");
        int exponentValue = exponent.nextInt();

        System.out.println("Sonuç: " + exponent(baseValue, exponentValue)); // Çıktıyı alıyoruz.

    }
}
 /*    /// WAY 2 ------ (2. YOL)-----------

        static voin exponent () {
        Scanner exponent = new Scanner(System.in);
        System.out.print("Lütfen Taban değerini giriniz: ");
        int baseValue = exponent.nextInt();

        System.out.print("Lütfen Üs değerini giriniz: ");
        int exponentValue = exponent.nextInt();
        int result = 1;

        for (int i = 1; i <= exponentValue; i ++) {
            result *= baseValue;
        }
        }

        System.out.print("Sonuç: " + result);

         public static void main(String[] args) {
         exponent();
         }
    } */