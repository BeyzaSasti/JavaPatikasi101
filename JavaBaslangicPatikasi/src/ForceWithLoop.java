/* Ödev
   Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
   Homework
   We are writing a program that prints the powers of 4 and 5 up to the number entered with Java loops.
 */
import java.util.Scanner;

public class ForceWithLoop {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan veri alıyoruz;
        System.out.print("Please enter the limit number you set.: ");
        n = input.nextInt();

        // 4 ve 5 'in katı için gerekeb dönüyü ve koşullarını oluşturuyoruz;
        System.out.print("Numbers that are powers of 4 up to the entered number: ");
        for (int i = 1; i <= n; i*=4) {
            System.out.print(i + ",");
        }

        System.out.print("\nNumbers that are powers of 5 up to the entered number: ");
        for (int i = 1; i <= n; i*=5) {
            System.out.print(i + ",");
        }
    }
}
