// Program to Find Repeating Even Numbers in an Array.

package ArraysWorkingFolder;

import java.util.Arrays;

public class EvenNumbersInAnArray {

    static boolean isFind(int[] arr, int value) { //Değerin 2.kere olup olmadığını kontrol etmek için boolean ifadesi kullanıyoruz.
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] values = {1, 2, 15, 78, 46, 20, 13, 8, 3, 65, 86, 60, 3, 78, 20, 13, 90, 2, 33, 46, 59, 46, 2, 67, 86, 90};
        int [] duplicateDouble = new int [values.length]; // Tekrar eden çift sayıları atayacağımız diziyi oluşturypruz.
        int startValues = 0; //Başayacağımız bir indeks değeri oluştuyoruz.

        for (int i = 0; i < values.length; i ++) { // Dizinin elemanlarını geziyoruz.
            for ( int j = 0; j < values.length; j++) {
                    if ((i != j) && (values[i] == values[j])) { // Değerleri karşılaştırmak için koşul oluşturuyoruz.
                        if (!isFind(duplicateDouble, values[i])) {
                            if (duplicateDouble[j] % 2 == 0){ // Yalnızca tekrar eden çift sayıları belirlemek için koşul oluşturuyoruz.
                            duplicateDouble[startValues++] = values[i];
                        }
                        break;
                    }
                }
            }
        }
         // Çıktı;
                System.out.println(Arrays.toString(duplicateDouble));
    }
}
