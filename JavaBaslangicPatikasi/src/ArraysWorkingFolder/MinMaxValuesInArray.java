// Program Finding the Nearest Maximum and Minimum Values in an Array.

package ArraysWorkingFolder;
import java.util.Scanner;
import java.util.Arrays;

public class MinMaxValuesInArray {
    public static void main(String[] args) {

         int valuesList [] = {15,12,788,1,-1,-778,2,0}; // Dizi elemanlarını oluşturuyoruz.
         Scanner value = new Scanner(System.in);

         System.out.println("Dizi: " + Arrays.toString(valuesList)); // Dizinin çıktısını alıyoruz.
         System.out.print("Lütfen bir değer giriniz: "); // Kullanıcıdan değer istiyoruz.
         int number = value.nextInt();

         int min = number;
         int max = number;

         Arrays.sort(valuesList); // Diziyi küçükten büyüğe sıralıyoruz.
         for (int i: valuesList) { // En yakın büyük sayıyı buluyoruz.
             if (i > number) {
                 max = i;
                 break;
             }
         }

         //En yakın küçük sayıyı buluyoruz.
         for (int i = valuesList.length - 1; i >= 0; i--) {
             if (valuesList[i] < number) {
                 min = valuesList[i];
                 break;
             }
         }

         // Çıktı;
         System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
         System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);



    }
}
