/* 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
 hesaplayan program.
 Program that calculates the average of the numbers from 0 to the entered number that are exactly
 divisible by 3 and 4 */
import java.util.Scanner;
public class NumberAveragingWithLoops {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numb, sum = 0, count = 0, average;
        /* Ortalama hesaplaması için 3 ve 4 e tam bölünebilen sayıları temsilen count,
         sayıların toplamını temsilen sum ve ortalama için average değişkenleri tanımlandı.  */

        System.out.print("Please enter a number(Lütfen sayı giriniz): ");
        numb = inp.nextInt();

         for (int i = 1; i <= numb; i++) {
             if ((i % 3 == 0) && (i % 4 == 0)) {
                 count++;
                 sum += i;
             }
         }
         average = sum/count;
         System.out.println("Average(Ortalama) : " + average);
    }
}
