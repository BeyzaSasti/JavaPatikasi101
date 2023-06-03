/*   Task Or Homework
  Perform ATM operations using "Switch-Case" ("Switch-Case" kullanarak ATM işlemlerini gerçekleştirin.).  */

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        String userName, password;
        int right = 3, select;
        int balance = 15600;

        while (right > 0) {  //İlk olarak kullanıcının bilgileri için deneme haklarına özgü döngü işlemi gerçekleştiriyoruz.
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userName = atm.nextLine();
            System.out.print("Lütfen şifrenizi giriniz: ");
            password = atm.nextLine();

            // Bilgilerin doğru olduğu durumlar için bloklar oluşturuyoruz.
            if ((userName.equals("Beyzasasti") && password.equals("abcD123"))) {
                System.out.println("Merhana PatiKod Bankasına Hoşgeldiniz!");
                do { // Yapmak istenilen işlemler için bilgi alıyoruz.
                    System.out.println("Para yatırma: (1)" +
                            "\nPara Çekme: (2)" +
                            "\nBakiye Sorgulama: (3)" +
                            "\nÇıkış Yap: (4)");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = atm.nextInt();
                    switch (select) { //Tercih edilen işlem için kod blokları oluşturuyoruz.
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = atm.nextInt();
                            balance += price;
                            System.out.println("Para hesabınıza takımlandı.\nGüncel bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int extraction = atm.nextInt();
                            if (extraction > balance) {
                                System.out.println("İşlem için BAKİYE YETERSİZ!");
                            } else {
                                balance -= extraction;
                                System.out.println("Kalan Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Sizi gördüğümüze mutlu olduk. Tekrar görüşmek üzere!");
                break;
            } else { //Kullanıcı adı veya şifrenin hatalı olduğu durumlarda kullanıcıya bilgi için kod bloklarını oluşturuyoruz.
                right --;
                if (right != 0) {
                    System.out.println("Kullanıcı adı veya Şifreniz HATALI! Lütfen tekrar deneyiniz!");
                    System.out.println("Kalan Giriş Deneme Hakkınız: " + right);
                }else {
                    System.out.println("Hesabınız BLOKE olmuştur. Lütfen banka ile iletişime geçiniz!");
                }
            }

        }


    }
}
