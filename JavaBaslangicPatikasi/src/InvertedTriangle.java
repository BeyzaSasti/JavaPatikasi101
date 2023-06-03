/* Task
 Write a program in Java that draws an inverted triangle with asterisks (*) on the screen using loops
 and taking the number of digits from the user (Java'da döngüler kullanarak ve kullanıcıdan basamak
 sayısını alarak ekrana yıldız işaretli (*) ters bir üçgen çizen bir program yazın).
  */

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        int number;

        System.out.print("Please enter a number: ");
        number = triangle.nextInt();

        for(int i = number - 1; i >= 0; i--) { //Satır sayısı için for döngüsü oluşturduk.
            for(int k = 0; k <= number - i; k++) { //Satırdaki boşluklar için for döngüsü oluşturduk.
                System.out.print(" ");
            }
            for(int t = 1; t <= (2*i) - 1; t++) { //Yıldız sayısı için for döngüsü oluşturduk.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
