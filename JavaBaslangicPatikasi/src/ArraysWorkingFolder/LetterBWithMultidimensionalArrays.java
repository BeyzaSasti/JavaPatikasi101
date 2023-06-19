//Program to Print Letter B with Multidimensional Arrays

package ArraysWorkingFolder;

public class LetterBWithMultidimensionalArrays {
    public static void main(String[] args) {

        // 8 'e 4'lük bir array oluşturuyoruz.
        String [][] letter = new String[8][4];
        // (i = 0 || i = 3 || i = 7)
        // (j = 0 || j = 3)

        //Satırları ve sütunları geziyoruz.
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 7) { //Yıldız bastıracağımız satır için koşulları oluşturuyoruz.
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) { // Yıldız bastıracağımız sütun için koşulları oluşturuyoruz.
                    letter [i][j] = " * ";
                } else {
                    letter [i][j] = "    "; //yıldızsız yerler için boşluk bastırıyoruz.
                }
            }
        }

        for (String[] row : letter) { //ilk olarak satırları...
            for (String col : row) { // ardından sütunları yazdırıp her satırda bir aşağı iniyoruz.
                System.out.print(col);
            }

            System.out.println();
        }


    }
}
