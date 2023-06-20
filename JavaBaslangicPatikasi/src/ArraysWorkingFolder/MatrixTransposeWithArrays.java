/* Task or Homework
Write a program in Java that finds the transpose of a matrix constructed with multidimensional arrays.
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
*/

package ArraysWorkingFolder;

public class MatrixTransposeWithArrays {
    public static void main(String[] args) {
        //Matris değerlerini oluşturyoruz.
        int [][] matrix = { {2, 5, 7}, {4, 9, 3} };
        int [][] transpose = new int[matrix[0].length][matrix.length];

        System.out.println("Matrix: ");
        // Matrisin indexlerini gezecek döngüyü oluştuyoruz.

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");
        // Transpozun indexlerini gezecek döngüyü oluşturuyoruz.

        for(int i = 0; i < transpose.length; i++) {
            for(int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
