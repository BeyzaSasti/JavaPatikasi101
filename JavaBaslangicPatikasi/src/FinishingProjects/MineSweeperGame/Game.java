package MineSweeperGame;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //Nesneleri oluşturup, oyunu başlatacak çıktıyı alıyoruz.
        Scanner games = new Scanner(System.in);
        int row, column;

        System.out.println("Welcome To The Minefield Game.\n" +
                "Please enter row and column for field size.");

        System.out.print("Row: ");
        row = games.nextInt();
        System.out.print("Column: ");
        column = games.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row, column);
        mineSweeper.run();
    }
}
