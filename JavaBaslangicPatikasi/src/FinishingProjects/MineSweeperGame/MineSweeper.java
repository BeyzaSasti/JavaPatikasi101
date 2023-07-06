package MineSweeperGame;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MineSweeper {
    // Nitelikleri oluşturuyoruz.
    int rowNumber, colNumber, size;
    String[][] map;
    String[][] board;
    Random random = new Random();
    Scanner minesG = new Scanner(System.in);
    boolean game = true;

    // Kurucu metotu oluşturuyoruz.
    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = (rowNumber * colNumber) ;
    }

    // davranışlar için kod bloklarını oluşturuyoruz.
    public void run() {
        int row, col,userCount=0;
        prepareMapBoard();
        System.out.println("If You're Ready, Let's Start the Game! ");
        System.out.println("Right before we start, let's determine the game size.");
        while (game) {

            print(board);
            System.out.print("Please enter the row: ");
            row = minesG.nextInt();
            System.out.print("Please enter the col: ");
            col = minesG.nextInt();
            if (row<0 || row>=rowNumber|| col<0 || col>=colNumber){
                System.out.println("Invalid entered! Please try again.");
                continue;
            }
            if (map[row][col] != "* ") {
                checkMine(row, col);
                userCount++;
                if (userCount == size -(size/4)) {
                    System.out.println("CONGRATULATİONS! You won the game.");
                    break;
                }
            } else {
                game = false;
                System.out.println("YOU LOST! Game Over.");
            }
        }
    }

    public void checkMine(int r, int c) { //Burada oyunucunun girdiği değere değen mayın olup olmadığının kontorllerini sağlıyoruz.
        int countStars = 0;
        if (board[r][c] == "- ") {
            if ((c<colNumber-1)&&(map[r][c + 1] == "*")) {
                countStars++;
            }
            if ((r<rowNumber-1)&&(map[r + 1][c] == "*")) {
                countStars++;
            }
            if ((c!=0)&&(map[r][c - 1] == "*")) {
                countStars++;
            }
            if ((r!=0)&&(map[r - 1][c] == "*")) {
                countStars++;
            }
            if ((r!=0&&c!=0)&&(map[r - 1][c - 1] == "*")) {
                countStars++;
            }
            if ((r<rowNumber-1&&c<colNumber-1)&&(map[r + 1][c + 1] == "*")) {
                countStars++;
            }
            if ((r<rowNumber-1&&colNumber!=0)&&(map[r+1][c-1]=="*")){
                countStars++;
            }
            if ((rowNumber!=0&&c<colNumber-1)&&(map[r-1][c+1]=="*")){
                countStars++;
            }
        }
        String count = String.valueOf(countStars);
        board[r][c] = count;
    }

    // Hazırlanan oyun haritasını düzenliyoruz.
    public void prepareMapBoard() {
        int randRow, randCol, count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }
        while (count != size/4) {
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);
            if (map[randRow][randCol] != "*") {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }


    public void print(String[][] arr) { //Çıktı oluşturuyoruz.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}