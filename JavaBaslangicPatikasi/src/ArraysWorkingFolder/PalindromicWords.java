/* We are writing a program in Java that finds whether the word entered by the user is "Palindromic" or not.
   Java'da kullanıcı tarafından girilen kelimenin "Palindromik" olup olmadığını bulan bir program yazıyoruz.*/


package ArraysWorkingFolder;
import java.util.Scanner;
public class PalindromicWords {

    // String türündeki elemanın boolean metoduyla kontrolünü sağlıyoruz.
    static boolean isPolindrome(String str) {
        String reverse = "";

        // döngü ile kelimenin indislerini geziyoruz.
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Polindrom mu değil mi kontrol ediyoruz.
        if(str.equals(reverse)){
            System.out.print("Palindromiktir!\n");
            return true;
        } else {
            System.out.println("Palindromik Değildir!\n");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);

        // Kullanıcıdan değer alıyoruz.
        System.out.print("Kelimeniz Palindromik mi ?" + "\nLütfen kelimenizi yazınız! : ");
        String word = words.nextLine();

        //Çıktı;
        System.out.print("Girdiğiniz  ' " + word + " '  kelimesi " );
        System.out.println(isPolindrome(word));

    }
}
