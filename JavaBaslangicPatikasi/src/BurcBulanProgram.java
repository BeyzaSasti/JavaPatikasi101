    /*                     Koç Burcu : 21 Mart - 20 Nisan (Aries Horoscope : March 21 - April 20)
                        Boğa Burcu : 21 Nisan - 21 Mayıs (Taurus Horoscope : April 21 - May 21)
                      İkizler Burcu : 22 Mayıs - 22 Haziran (Gemini Horoscope : May 22 - June 22)
                    Yengeç Burcu : 23 Haziran - 22 Temmuz (Cancer Horoscope : June 23 - July 22)
                 Aslan Burcu : 23 Temmuz - 22 Ağustos (Leo Horoscope : July 23 - August 22)
             Başak Burcu : 23 Ağustos - 22 Eylül (Virgo Horoscope : August 23 - September 22)
           Terazi Burcu : 23 Eylül - 22 Ekim (Libra Horoscope : September 23 - October 22)
          Akrep Burcu : 23 Ekim - 21 Kasım (Scorpio Horoscope : October 23 - November 21)
            Yay Burcu : 22 Kasım - 21 Aralık (Sagittarius Horoscope : November 22 - December 21)
               Oğlak Burcu : 22 Aralık - 21 Ocak (Capricorn : December 22 - January 21)
                 Kova Burcu : 22 Ocak - 19 Şubat (Aquarius Horoscope : January 22 - February 19)
                       Balık Burcu : 20 Şubat - 20 Mart (Pisces Horoscope : February 20 - March 20)
Ödev
Aynı örneği switch-case kullanmadan yapınız.*/

import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        System.out.println("Burç bulma programına hoşgeldiniz!" +
                "\nLütfen doğum ayınızı ve gününüzü 'Sayı' ile giriniz!");
        Scanner input = new Scanner(System.in);
        // İlk olarak doğum bilgilerine dair verileri alıyoruz.
        System.out.print("Lütfen doğdunuz 'AY'ı giriniz: ");
        month = input.nextInt();
        System.out.print("Lütfen ayın hangi 'Gün'ünde doğdunuzu giriniz: ");
        day = input.nextInt();

        // Kullanıcıdan alınan verilere göre burçlarını belirtmek için gereken koşulları oluşturuyoruz.
        if (month < 13 && month > 0) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "'OĞLAK'";
                    } else {
                        horoscope = "'KOVA'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "'KOVA'";
                    } else {
                        horoscope = "'BALIK'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = ("'BALIK'");
                    } else {
                        horoscope = "'KOÇ'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "'KOÇ'";
                    } else {
                        horoscope = "'BOĞA'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "'BOĞA'";
                    } else {
                        horoscope = "'İKİZLER'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "'İKİZLER'";
                    } else {
                        horoscope = "'YENGEÇ'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "'YENGEÇ'";
                    } else {
                        horoscope = "'ASLAN'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "'ASLAN'";
                    } else {
                        horoscope = "'BAŞAK'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "'BAŞAK'";
                    } else {
                        horoscope = "'TERAZİ'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "'TERAZİ'";
                    } else {
                        horoscope = "'AKREP'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "'AKREP'";
                    } else {
                        horoscope = "'YAY'";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "'YAY'";
                    } else {
                        horoscope = "'OĞLAK'";
                    }
                } else {
                    isError = true;
                }
            }
            if (isError) {
                System.out.println("Bilgileriniz hatalı, lütfen tekrar deneyiniz!");
            } else {
                System.out.println("Burcunuz: " + horoscope);
            }
        } else {
            System.out.println("Bilgileriniz hatalı, lütfen tekrar deneyiniz!");
        }

    }
}
