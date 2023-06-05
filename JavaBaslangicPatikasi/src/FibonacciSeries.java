/* We are writing a program that finds the fibonacci series with Java loops. We get the number of
   elements of the Fibonacci series from the user.
   (Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını
   kullanıcıdan alın.)

   9 Element Fibonacci Series : 0 1 1 2 3 5 8 13 21 34
   */
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner fibonacci = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Please enter the number (n) of elements for your the Fibonacci Series: ");
        n = fibonacci.nextInt();

        int firstNum = 0, secondNum = 1; // 1. ve 2.sayı her zaman sabit olduğu için değerlerini atıyoruz.

        for(int i = 1; i <= n; i++) { // Gereken koşulu oluşturarak döngüye alıyoruz.
            System.out.println(firstNum + " + " + secondNum + " = " + sum);
            sum = firstNum + secondNum;
            firstNum = secondNum; // İlk işlemden sonra 2.sayı, 1.sayı yerine geçiyor.
            secondNum = sum; // İlk işlemden sonra toplam, 2.sayı yerine geçiyor.
        }
    }
}
