/* Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {

        String userName, password, newPassword, newPassword1;

        Scanner inp = new Scanner(System.in);

        // Kullanıcı adı ve şifreyi alıyoruz.
        System.out.println("Hoşgeldiniz!");
        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        // Tüm bilgiler doğruysa hatasız giriş;

        if (userName.equals("Beyzasasti") && password.equals("abcD123")) {
            System.out.println("Giriş işlemi başarılı!");
        } else {
            if (!userName.equals("Beyzasasti")) {
                System.out.println("Kullanıcı adınız hatalı!");
            } else if (!password.equals("abcD123")) {
                System.out.println("Şifreniz Hatalı!\nŞifreyi değiştirmek istiyor musunuz?" +
                        "\nİstiyorsanız lütfen evet yazınız!");
                String answer = inp.nextLine();

                if (answer.equalsIgnoreCase("evet")) {
                    System.out.println("Lütfen güvenlik açısından yeni şifrenizi 2 kere giriniz!");
                    System.out.print("Şifre: ");
                    newPassword = inp.nextLine();
                    System.out.print("Şifre tekrar: ");
                    newPassword1 = inp.nextLine();

                    // Sifre basarılı şekilde değiştirilirse;
                    if (((!newPassword.equals("abcD123")) && (!newPassword1.equals("abcD123"))) && (newPassword.equals(newPassword1))) {
                        System.out.print("Şifre değiştirme işlemi başarılı !");

                        // Sifre başarısız bir şekilde değiştirilirse;
                    } else {
                        System.out.println("İşlem başarısız!" +
                                "\nLütfen eski şifre girmeyeniz veya şifrenizi kontrol ediniz!");

                    }
                }  else {
                        System.out.print("İşlem başarısız, lütfen tekrar deneyin!");
                    }


                }


            }

        }
    }

