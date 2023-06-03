/* Task or Homework
   Write a program in Java that prints the prime numbers between 1 and 100 on the screen.
   Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/

public class PrimeNumber {
    public static void main(String[] args) {
        int border = 100;

        System.out.println("Sistem 1 ile 100 arasındaki ASAL sayıları göstermektedir.");

        // 1 ile 100 arasındaki sayılar için asal sayı aralığını oluşturuyoruz.
        for(int i = 2; i <= border; i++) {
            int control = 0;// Aralık arasındaki sayıların asal olup olmadığını kontrol ediyoruz.
            for (int k = 2; k < i; k++) {
                if (i % k == 0) { //Kendisinden başka böleninin olup olmadığına bakıyoruz.
                    control++;
                }
            }
            if (control == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
