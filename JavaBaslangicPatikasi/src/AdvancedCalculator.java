/* Task or Homework
* With Java, we create a calculator that performs operations selected by the user.
* (Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.)
*
* Calculator operations
* 1- Addition process (Toplama İşlemi)
* 2- Subtraction (Çıkarma İşlemi)
* 3- Multiplication (Çarpma İşlemi)
* 4- Division process (Bölme İşlemi)
* 5- Exponential number calculation (Üslü Sayı Hesaplama)
* 6- Factorial calculation (Faktöriyel Hesaplama)
* 7- Mode retrieval (Mod alma)
* 8- Rectangle perimeter and area calculation (Dikdörtgen çevre ve alan hesabı)
*/

import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {    // Toplama hesabı için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : "); //Kullanıcıdan veri alıyoruz.
        int counter = calculator.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) { // Döngü içerisinde koşulları oluşturuyoruz.
            System.out.print(i + ". sayı: ");
            number = calculator.nextInt(); // Kullanıcıdan sayıları istiyoruz.

            result += number; // Formülü oluşturup..
        }
        System.out.println("Sonuç: " + result); // ... çıktıyı istiyoruz.
    }

    static void subt () { // Çıkarma işlemi için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : "); // Kullanıcıdan sayı adet bilgisi istiyoruz.
        int counter = calculator.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) { // İşlemin başını ve sonunu bildiğimiz için for döngüsünü kullanıyoruz.
            System.out.print(i + ". sayı: ");
            number = calculator.nextInt(); // Kullanıcıdan sayıları istiyoruz.
            if (i == 1) { // Koşulları oluşturuyoruz.
                result += number;
                continue;
            }
            result -= number; // İşlem için formül oluşturup çıktı istiyoruz.
        }
        System.out.println("Sonuç: " + result);
    }

    static void multip() { // Çarpma işlemi için kod bloğu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : "); // Kullanıcıdan girilecek sayı miktarını alıyoruz.
        int counter = calculator.nextInt();
        int number, result = 1;

        for(int i = 1; i <= counter; i++) { // İşlemi başı ve sonu bilindiğinden for döngüsü kullanıyoruz.
            System.out.print(i + ". sayı: ");
            number = calculator.nextInt();

            if(number == 0) { // 0 olduğu durumda gereken koşulu oluşturuyoruz.
                result = 0;
                break;
            }
            result *= number; // İşlem için formül oluşturup çıktı istiyoruz.
        }
        System.out.println("Sonuç: " + result);
        }


    static void divided() { //Bölme işlemi için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?: "); // Kullanıcıdan gireceği değer sayısını istiyoruz.
        int counter = calculator.nextInt();
        double number, result = 0.0;

        for ( int i = 1; i <= counter; i++) { //For döngüsü içerisinde..
            System.out.print(i + ". sayı: ");
            number = calculator.nextDouble();
            if (i != 1 && number == 0) { // ...0 girilen durum için ...
                System.out.println("Böleni 0 giremezsiniz! ");
                continue;
            }
            if (i == 1) { //... ve 1 girilen durum için koşulları oluşturuyoruz.
                result = number;
                continue;
            }
            result /= number; // İşlem için formül oluşturup çıktı istiyoruz.
        }
        System.out.println("Sonuç: " + result);
    }

    static void expon() { // Üs alma işlemi için gereken kod bloğunu oluşturuyoruz.
       Scanner calculator = new Scanner(System.in);
       System.out.print("Taban değerini giriniz: "); // Kullanıcıdan verileri alıyoruz.
       int base = calculator.nextInt();
       System.out.print("Üs değerini giriniz: ");
       int exponent = calculator.nextInt();
       int result = 1;

       for (int i = 1; i <= exponent; i++) { // For döngüsü içerisinde...
           result *= base; // ...işlem için formül oluşturup çıktı istiyoruz.
       }
       System.out.println("Sonuç: " + result);
    }

    static void factorial() { // Faktöriyel hesaplaması için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Sayı giriniz: "); // Kullanıcıdan sayı bilgisi alıyoruz.
        int n = calculator.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i ++ ) { // Döngü içerisinde koşulları oluşturuyoruz.
            result *= i;  // // İşlem için formül oluşturup çıktı istiyoruz.
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() { // Mod hesabı için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?: "); // Kullanıcının girceği sayı miktarını alıyoruz.
        int counter = calculator.nextInt();
        double number, result = 0.0;

        for ( int i = 1; i <= counter; i++) { //Girilecek sayı miktarına göre döngüyü oluşturuyoruz.
            System.out.print(i + ". sayı: ");
            number = calculator.nextDouble();
            if (i != 1 && number == 0) { // 0 sayısı için gereken koşulları oluşturuyoruz.
                System.out.println("Böleni 0 giremezsiniz! ");
                continue;
            }
            if (i == 1) { // 1 için gereken koşulları oluşturuyoruz.
                result = number;
                continue;
            }
            result %= number; //// İşlem için formül oluşturup çıktı istiyoruz.
        }
        System.out.println("Sonuç: " + result);

    }
    static void calc () { // Dikdörtgenin çevre ve alan hesabı için gereken kod bloğunu oluşturuyoruz.
        Scanner calculator = new Scanner(System.in);
        System.out.print("Lütfen uzun kenar için değer giriniz: "); // Kullanıcıdan değerleri alıyoruz.
        int longEdge = calculator.nextInt();
        System.out.print("Lütfen kısa kenar için değer giriniz: ");
        int shortEdge = calculator.nextInt();

        System.out.println("Çevre: " + (2*(longEdge + shortEdge))); //// İşlem için formül oluşturup çıktı istiyoruz.
        System.out.println("Alan: " + (longEdge * shortEdge));
    }


    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktöriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "0- Çıkış Yap\n";

        System.out.println(menu); // Kullanıcıya kullanım için oluşturduğumuz menüyü yönlendiriyoruz.
        do {
            System.out.print("Lütfen bir işlem seçiniz: "); // İşlem bilgisi alıyoruz.
            select = calculator.nextInt();
            switch (select) { //... YUkarıda oluşturulan kod bloklarının kullanımı için switch-case metodunu kullanıyoruz.
                case 1:
                    plus();
                    break;
                case 2:
                    subt();
                    break;
                case 3:
                    multip();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    expon();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz bir değer girdiniz. Lütfen tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
