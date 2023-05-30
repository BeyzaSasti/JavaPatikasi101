import java.util.Scanner;

public class not_ortalaması_hesaplama {
    public static void main(String[] args) {
        System.out.print("Not Ortalama Hesaplama Programımıza Hoşgeldiniz. Lütfen notlarınızı sırasıyla giriniz!");

        // Değiştenleri oluşturma;
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla;
        Scanner inp = new Scanner(System.in);

        // Kullanıcadan not değerlerini atama;
        System.out.print( "\nMatematik Notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();

        // Ortalama için;
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Not Ortalamanız : " + sonuc);

        // Koşul operatörü ile
        String degerlendirme = (sonuc >= 60) ? "Tebrikler! \nSınıfı geçtiniz." : "Sınıfta kaldınız!";
        System.out.print("Sınıf Değerlendirmesi: " + degerlendirme);


    }
}