
/* We are making a program in Java that finds whether a number is
a "Palindrome Number" or not.
* Palindromic numbers are numbers that are the same when read from both sides. */


public class PolindromeNumbers {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) { // Basamakları tek tek ona bölerek gezmemiz ve gezecek basamak kalmadığında döngüden çıkmmamız lazım.
            lastNumber = temp % 10; // Son basamağı buluyoruz.
            reverseNumber = (reverseNumber *10) + lastNumber; // Ters sayının ilk değerini alıyoruz.
            temp /= 10; // Buradada temp değişkeninin sondaki basamağını atmış olup döngünün 7'den sonra ki sayı için tekrar etmesini sağlıyoruz.

        }

        if (number == reverseNumber) {
            System.out.println(number + " sayısı Polindrom bir sayıdır.");
            return true;
        }
        else {
            System.out.println(number + " sayısı Polindrom bir sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(2476));
    }
}
