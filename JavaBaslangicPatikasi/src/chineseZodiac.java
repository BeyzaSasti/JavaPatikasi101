/*
 */

import java.util.Scanner;
public class chineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // değişkenleri atıyoruz;
        int birthYear, zodiacHoroscape;
        String chineseZodHoroscape = "";
        boolean isError = false;

        // kullanıcıdan doğum bilgisini istiyoruz.
        System.out.print("Çin Zodyağı'na Hoşgeldiniz! \nLütfen doğum yılınızı giriniz!:");
        birthYear = input.nextInt();

        // zodiac hesaplaması için doğduğu yılın modunu alalım.
        zodiacHoroscape = birthYear%12;

        // Switch-case yapısını kullanarak burçları bulalım.
        switch (zodiacHoroscape) {
            case 0:
                chineseZodHoroscape = "Burcunuz: MAYMUN";
                break;
            case 1:
                chineseZodHoroscape = "Burcunuz: HOROZ";
                break;
            case 2:
                chineseZodHoroscape = "Burcunuz: KÖPEK";
                break;
            case 3:
                chineseZodHoroscape = "Burcunuz: DOMUZ";
                break;
            case 4:
                chineseZodHoroscape = "Burcunuz: FARE";
                break;
            case 5:
                chineseZodHoroscape = "Burcunuz: ÖKÜZ";
                break;
            case 6:
                chineseZodHoroscape = "Burcunuz: KAPLAN";
                break;
            case 7:
                chineseZodHoroscape = "Burcunuz: TAVŞAN";
                break;
            case 8:
                chineseZodHoroscape = "Burcunuz: EJDERHA";
                break;
            case 9:
                chineseZodHoroscape = "Burcunuz: YILAN";
                break;
            case 10:
                chineseZodHoroscape = "Burcunuz: AT";
                break;
            case 11:
                chineseZodHoroscape = "Burcunuz: KOYUN";
                break;
            default:
                isError = true;
                System.out.println("Burcunuz hesaplanamadı lütfen tekrar deneyininiz!");
        }
        if(!isError){
            System.out.println("Çin Zodyağı" + chineseZodHoroscape);
        }
    }
}
