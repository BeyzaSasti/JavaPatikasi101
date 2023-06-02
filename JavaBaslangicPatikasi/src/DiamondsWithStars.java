/* Task or Homework (Ödev)
   Make diamonds with stars using loops in Java.
   (Java'da döngüler kullanarak yıldızlar ile elmas yapınız). */

import java.util.Scanner;

public class DiamondsWithStars {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.print("Please enter to number: ");
        int number = star.nextInt();

        for (int i = 1; i <= number; i++) {         // Satır sayısı için for döngüsü oluşturduk.
            for (int k = 0; k <= (number - i); k++) {  // Satırlardaki boşluklar için for döngüsü oluşturduk.
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++) { // Yıldız sayısı için for döngüsü oluşturduk.
                System.out.print("*");
            }
            System.out.println();
        }

        /* Elmas oluşturmak için aşağıya doğru bir ters üçgen yapmamız lazım. Dolyısıyla yukarı işlemlerin
        tersini kullanıyoruz. */
        for(int x = number - 1; x >= 0; x-- ) {
            for (int y = 0; y <= number - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2*x) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
