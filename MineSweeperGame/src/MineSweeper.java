import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    String[][] board;
    String[][] revealed;
    int mines;
    boolean gameOver;

    MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.board = new String[row][col];
        this.mines = (row * col) / 4;
        this.revealed = new String[row][col];
        this.gameOver = false;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                this.board[i][j] = "-";
                this.revealed[i][j] = "-";
            }
        }
        placeMines();
        calculatedAdjacentMines();
    }

    public void placeMines(){
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < mines){
            int minesRow = rand.nextInt(this.row);
            int minesCol = rand.nextInt(this.col);
            if (!board[minesRow][minesCol].equals("*")){
                board[minesRow][minesCol] = "*";
                minesPlaced++;
            }
        }
    }

    public void calculatedAdjacentMines(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (!board[i][j].equals("*")){
                    board[i][j] = countAdjacentMines(i, j);
                }
            }
        }
    }

    public String countAdjacentMines(int row, int col){
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++){
            for (int j = col - 1; j <= col + 1; j++){
                if (i >= 0 && i < this.row && j >= 0 && j < this.col && board[i][j].equals("*")){
                    count++;
                }
            }
        }
        return String.valueOf(count);
    }

     public void run(){
         Scanner inp = new Scanner(System.in);
         minesLocation();
         System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
         while (!gameOver){
             printBoard();
             System.out.print("Satır girin: ");
             int row = inp.nextInt();
             System.out.print("Sütun girin: ");
             int col = inp.nextInt();
             if (row >= 0 && row < this.row && col >= 0 && col < this.col){
                 if (revealed[row][col].equals(" ")){
                     System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                 } else if (board[row][col].equals("*")){
                     gameOver = true;
                     System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                 } else {
                     reveal(row, col);
                     if (isGameWon()){
                         gameOver = true;
                         System.out.println("Tebrikler! Oyunu kazandınız.");
                     }
                 }
             } else {
                 System.out.println("Geçersiz giriş!");
             }
         }
         inp.close();
    }

    public void reveal(int row, int col){
        if (row >= 0 && row < this.row && col >= 0 && col < this.col && revealed[row][col].equals("-")){
            revealed[row][col] = " ";
            if (board[row][col].equals("0")){
                for (int i = row - 1; i <= row; i++){
                    for (int j = col - 1; j <= col; j++){
                        reveal(i, j);
                    }
                }
            }
        }
    }

    public boolean isGameWon(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                if (!board[i][j].equals("*") && revealed[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(){
        System.out.println("==================================");
        System.out.print("  ");
        for (int i = 0; i < this.col; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < this.row; i++){
            System.out.print(i + " ");
            for (int j = 0; j < this.col; j++){
                if (revealed[i][j].equals(" ")){
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("==================================");
    }

    public void minesLocation(){
        System.out.println("Mayınların Konumu");
        System.out.println("==================");
        System.out.print("  ");
        for (int i = 0; i < this.col; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < this.row; i++){
            System.out.print(i + " ");
            for (int j = 0; j < this.col; j++){
                if (!board[i][j].equals("*")){
                    System.out.print("- ");
                }else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("==================");
    }
}
