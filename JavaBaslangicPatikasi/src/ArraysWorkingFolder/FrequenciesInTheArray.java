/* Task or Homework
A program in Java that finds the number of times the elements in an array are repeated, i.e. their frequency.
Java'da bir dizideki elemanların kaç kez tekrarlandığını, yani frekanslarını bulan bir program.
 */

package ArraysWorkingFolder;
import java.util.Arrays;

public class FrequenciesInTheArray {
    public static void main(String[] args) {
        // Dizileri ve kullanacağımız değerleri oluşturuyoruz.
        int[] values = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int [values.length];
        int count = 1;
        int startIndex = -1;

        System.out.println("Dizi: " + Arrays.toString(values));
        System.out.println("Tekrar Sayıları: ");

        //Döngülerle seriyi geziyoruz.
        for(int i = 0; i < values.length; i++) {
            for(int j = i + 1; j < values.length; j++) {
                if(values[i] == values[j]){ // Tekrar sayılarını bulmak için koşulları oluşturuyoruz.
                    count++;
                    duplicate[j] = startIndex;
                }
            }
            if(duplicate[i] != startIndex){
                duplicate[i] = count;
            }
        }
        // Sayıların tekrar durumları için döngü içerisinde koşul oluşturup çıktı oluyoruz.
        for (int i = 0; i < duplicate.length; i++) {
            if(duplicate[i] != startIndex) {
                System.out.println(values[i] + " sayısı " + duplicate[i] + " kere tekrar etti.");
            }
        }

    }
}
