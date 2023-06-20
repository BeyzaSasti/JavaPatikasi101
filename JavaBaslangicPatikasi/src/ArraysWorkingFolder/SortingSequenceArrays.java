// Task or Homework
//A program that sorts the user-entered elements in the array from smallest to largest.
//Kullanıcı tarafından girilen elemanları dizide küçükten büyüğe doğru sıralayan bir program.

package ArraysWorkingFolder;

import java.util.Scanner;
import java.util.Arrays;

public class SortingSequenceArrays {
    public static void main(String[] args) {
        Scanner valuesIn = new Scanner(System.in);

        System.out.print("Dizinin boyutu (n): "); //Boyutu kullanıcıdan istiyoruz.
        int size = valuesIn.nextInt();

        int [] arr = new int[size]; //Kullanıcının girdiği n değerini diziye entegre ediyoruz.
        int element;
        int startValues = 0;

        System.out.println("Dizinin elemanlarını giriniz: "); //Kullanıcıdan diziye dahil olacak değer sayısı kadar eleman girmesini istiyoruz.
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            element = valuesIn.nextInt();
            arr[startValues++] = element;
        }

        // Küçükten büyüğe sıralama için gereken döngüyü ve koşulu oluşturuyoruz.
        int sorting; // küçük sayıların sırasıyla eklenecek değişkeni oluştuyoruz.
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    sorting = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sorting;
                }
            }
        }
        //Çıktı;
        System.out.println("Sıralama: " + Arrays.toString(arr));

    }
}
