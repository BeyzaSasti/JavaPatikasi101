package ArraysWorkingFolder;

import java.util.Arrays;

public class HarmonicWithArrays {
    public static void main(String[] args) {

        int numberList [] = {1, 5, 60, 80, 75, 6, 5, 9, 21, 50}; // Dizi içerisinde değerleri oluşturuyoruz.
        double sum = 0.0;

        for (int i = 0; i < numberList.length; i++) { // Harmonik sayı hesabı için döngü ve hesap formülünü oluşturuyoruz.
            sum += 1.0 / numberList [i];
        }

       System.out.println(Arrays.toString(numberList) + " \n10 değeri olan Dizinin" + // Çıktı alıyoruz.
             "\nHarmonik Ortalama Sonucu: " + numberList.length / sum);
    }
}
 /*  2. yöntem "ForEach" kullanım:
         for (double i : numberList) {
         sum += 1.0 / i;
         }
    */