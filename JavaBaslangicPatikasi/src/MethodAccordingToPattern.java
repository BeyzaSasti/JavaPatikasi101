/* Task or Homework
In Java, we write a "Recursive" method that follows the following rule according to the value n received from the user and
without using a loop.
* Subtract the number 5 from the entered number until the entered number is 0 or negative.
Print the final value on the screen during each subtraction. After the number becomes negative or 0, add 5 again.
Again, print the final value of the number on the screen after each addition.
* (Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan
sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.)
*/


import java.util.Scanner;

public class MethodAccordingToPattern {

    static void pattern(int number, int count, boolean isContinue) {
        if (number <= 0) { // Girilen sayının 0 dan küçük olduğu durum için koşul ifadesini oluşturuyoruz.
            isContinue = false;
        }
        if (number > 0 && isContinue == true) { // Girilen sayı 0'dan büyük ve mantıksal değerin doğru olduğu durum için koşul oluşturuyoruz.
            System.out.print(number + " ");
            pattern(number - 5, ++count, isContinue); //Bu koşulun sağlandığı durumda girilen sayıdan 5 eksiltip sayacı ilerletiyoruz.
        } else {
            System.out.print(number + " ");
            if (count == 0) { // Sayac 0'a eşit olduğunda döndürüyoruz...
                return;
            } //...ve ters model için değişkenlere değerleri atıyoruz.
            pattern(number + 5, --count, isContinue);
        }
    }
    static void pattern(int number) { //Burada yukarıdaki değişkenleri tek bir değişkene atıyoruz.
        pattern(number, 0, true);
    }

    public static void main(String[] args) {
        Scanner pattern = new Scanner(System.in);
        System.out.print("Please enter to number: "); //Kullanıcıdan değer istiyoruz.
        int number = pattern.nextInt();

        pattern(number);
    }
}
