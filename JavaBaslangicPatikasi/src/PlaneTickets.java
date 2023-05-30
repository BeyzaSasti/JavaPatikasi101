/* OdevCalismasi
java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
    olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/


import java.util.Scanner;
public class PlaneTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, km, tripType;
        double costPerKm = 0.1, total;
        boolean isError = false;

        System.out.print("Lütfen gitmek istediği 'Mesafeyi' giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen 'Yaşınızı' giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen 'Yolculuk Tipini' giriniz (1 => Tek Yön , 2 => Gidiş Dönüş):");
        tripType = input.nextInt();
        total = km * costPerKm;
        // Kilometre için bir koşul sağlıyoruz.
        if (km > 0) {
            if (age < 12) {
                total -= total * 0.5; // ilk olarak 12 yaşından küçükler için indirim hesaplamasını sağlayıp;
                switch (tripType) { // ardından yolculuk/uçuş tiplerine göre koşulları oluşturuyoruz.
                    case 1:
                        total = total;
                        break;
                    case 2:
                        total -= total * 0.2;
                        total *= 2;
                        break;
                    default:
                        isError = true;
                }
            } else if (age >= 12 && age <= 24) {
                total -= total * 0.1;
                switch (tripType) {
                    case 1:
                        total = total;
                        break;
                    case 2:
                        total -= total * 0.2;
                        total *= 2;
                        break;
                    default:
                        isError = true;
                }
            } else if (age >= 65) {
                total -= total * 0.3;
                switch (tripType) {
                    case 1:
                        total = total;
                        break;
                    case 2:
                        total -= total * 0.2;
                        total *= 2;
                        break;
                    default:
                        isError = true;
                }
            } else {
                switch (tripType) {
                    case 1:
                        total = total;
                        break;
                    case 2:
                        total -= total * 0.2;
                        total *= 2;
                        break;
                    default:
                        isError = true;
                }
            }


        }
        if (isError == true) {
            System.out.println("Hatalı Veri Girişi ! Lütfen tekrar deneyin.");
        } else {
            System.out.println("Toplam Tutar: " + total + "TL");
        }

    }
}
