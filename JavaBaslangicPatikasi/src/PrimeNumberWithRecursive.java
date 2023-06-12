/* Task or Homework
* Write a program in Java using the "Recursive" method to find out if
the number received from the user is a "Prime" number.
 * (Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.)*/

import java.util.Scanner;

public class PrimeNumberWithRecursive {

    static boolean isPrime(int number, int i) {
        if (number == 0 || number == 1) { // 0 ve 1 asal sayı olmadığı için koşulu oluşturuyoruz.
            return false;
        } else if (number == 2) { // 2 asal sayı olduğu için gereken koşulu oluşturuyouruz.
            return true;
        } else if (i * i > number ) {
            return true; // Sayının karakökünden büyük sayılara bölünmez ise asal durum için koşulu oluşturuyoruz.
        } else {
            if (number % i == 0) { // Sayının bir böleni var ise bu bölen yalnızca kendisine ve 1'e eşit olmalıdır.
                if (i == 1) {
                    return isPrime(number, i + 1);
                } else if (number == i) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return isPrime(number, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner primeNumber = new Scanner(System.in);
        System.out.print("Please enter to number: ");
        int number = primeNumber.nextInt();

        if(isPrime(number,1)){
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }

    }
}
